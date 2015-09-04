package eceuwaterloo.andrito.activities;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import eceuwaterloo.andrito.R;
import eceuwaterloo.andrito.andrito_league.AndritoLeague;
import eceuwaterloo.andrito.andrito_league.dto.champion.ChampionDto;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.ChampionListDto;
import eceuwaterloo.andrito.andrito_league.dto.match.MatchDetail;

public class MainActivity extends AppCompatActivity {
    final static String MAIN_ACTIVITY = "MainActivity";
    final static String RIOT_API_KEY = "f9ba8619-91e8-4f5f-aa97-f881e18a846c";
    private EditText editText;
    private Button findOut;
    private ChampionListDto championListDto = null;
    private ChampionDto champion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.enter_champion_name);
        findOut = (Button) findViewById(R.id.find_out);
        findOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null || editText.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter a champion name!", Toast.LENGTH_SHORT).show();
                } else {
                    if (championListDto == null) {
                        new doAPICallStaticData().execute("https://na.api.pvp.net/api/lol/static-data/na/v1.2/champion/?api_key=");
                    } else {
                        String championID = String.valueOf(championListDto.getData().get(editText.getText().toString().replaceAll(" ", "")).getId());
                        new doAPICallChampion().execute("https://na.api.pvp.net/api/lol/na/v1.2/champion/" + championID + "?api_key=");
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class doAPICallStaticData extends AsyncTask<String, Integer, Integer> {
        @Override
        protected Integer doInBackground(String... params) {
            return populateChampionListDto(params[0]);
        }

        @Override
        protected void onPostExecute(Integer result) {
            String championID = String.valueOf(championListDto.getData().get(editText.getText().toString().replaceAll(" ", "")).getId());
            new doAPICallChampion().execute("https://na.api.pvp.net/api/lol/na/v1.2/champion/" + championID + "?api_key=");
        }
    }

    private int populateChampionListDto(String apiPath) {
        int responseCode = -1;
        try {
            URL url = new URL(apiPath + RIOT_API_KEY);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            responseCode = urlConnection.getResponseCode();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            championListDto = gson.fromJson(new InputStreamReader(is), ChampionListDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseCode;
    }

    private class doAPICallChampion extends AsyncTask<String, Integer, Boolean> {
        @Override
        protected Boolean doInBackground(String... params) {
            AndritoLeague andritoLeague = new AndritoLeague(RIOT_API_KEY, AndritoLeague.Region.NA);
            MatchDetail matchDetail = andritoLeague.getMatch("1811484253");
            return populateChampion(params[0]);
        }

        @Override
        protected void onPostExecute(Boolean result) {
            Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
        }
    }

    private boolean populateChampion(String apiPath) {
        boolean isFree = false;
        try {
            URL url = new URL(apiPath + RIOT_API_KEY);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            champion = gson.fromJson(new InputStreamReader(is), ChampionDto.class);
            isFree = champion.isFreeToPlay();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isFree;
    }

}
