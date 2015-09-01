package eceuwaterloo.andrito;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    final static String MAIN_ACTIVITY = "MainActivity";
    final static String RIOT_API_KEY = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new APICall().execute();
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

    private class APICall extends AsyncTask<Void, Integer, Boolean> {
        @Override
        protected Boolean doInBackground(Void... params) {
            return downloadContent();
        }

        @Override
        protected void onPostExecute(Boolean result) {
            Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
        }
    }

    private Boolean downloadContent() {
        boolean isFree = false;
        try {
            URL url = new URL("https://na.api.pvp.net/api/lol/na/v1.2/champion/02?api_key=" + RIOT_API_KEY);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            Champion champ = gson.fromJson(new InputStreamReader(is), Champion.class);
            isFree = champ.freeToPlay;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return isFree;
    }

    private class Champion {
        String id;
        boolean active;
        boolean botEnabled;
        boolean freeToPlay;
        boolean botMmEnabled;
        boolean rankedPlayEnabled;
    }
}
