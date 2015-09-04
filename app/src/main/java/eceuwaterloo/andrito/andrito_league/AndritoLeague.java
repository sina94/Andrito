package eceuwaterloo.andrito.andrito_league;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import eceuwaterloo.andrito.andrito_league.dto.champion.ChampionDto;
import eceuwaterloo.andrito.andrito_league.dto.champion.ChampionListDto;
import eceuwaterloo.andrito.andrito_league.dto.current_game.CurrentGameInfo;
import eceuwaterloo.andrito.andrito_league.dto.featured_games.FeaturedGames;
import eceuwaterloo.andrito.andrito_league.dto.game.RecentGamesDto;
import eceuwaterloo.andrito.andrito_league.dto.league.LeagueDto;
import eceuwaterloo.andrito.andrito_league.dto.league.LeagueList;
import eceuwaterloo.andrito.andrito_league.dto.match.MatchDetail;

/**
 * Created by Sina Abedi on 9/3/2015.
 */
public class AndritoLeague {
    private String riotAPIKey;
    private String commonAPIPath;
    private String observerCurrentGameAPIPath;
    private String observerFeaturedGamesAPIPath;
    private String region;

    public static enum Region {
        BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR;

        public String toString() {
            return name().toLowerCase();
        }
    }

    public static enum Platform {
        NA1, BR1, LA1, LA2, OC1, EUN1, TR1, RU, EUW1, KR;
    }

    public AndritoLeague(String riotAPIKey, Region region) {
        this.riotAPIKey = riotAPIKey;
        this.region = region.toString();
        commonAPIPath = "https://" + this.region + ".api.pvp.net/api/lol/" + this.region;
        observerCurrentGameAPIPath = "https://" + this.region + ".api.pvp.net/observer-mode/rest/consumer/getSpectatorGameInfo/";
        observerFeaturedGamesAPIPath = "https://" + this.region + ".api.pvp.net/observer-mode/rest/featured";

    }

    public ChampionListDto getChampionListDtoFromChampion() {
        ChampionListDto championListDto = null;
        try {
            URL url = new URL(commonAPIPath + "/v1.2/champion?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            championListDto = gson.fromJson(new InputStreamReader(is), ChampionListDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return championListDto;
    }

    public ChampionDto getChampionDtoFromChampion(String championId) {
        ChampionDto championDto = null;
        try {
            URL url = new URL(commonAPIPath + "/v1.2/champion/" + championId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            championDto = gson.fromJson(new InputStreamReader(is), ChampionDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return championDto;
    }

    public CurrentGameInfo getCurrentGame(String platformId, String summonerId) {
        CurrentGameInfo currentGameInfo = null;
        try {
            URL url = new URL(observerCurrentGameAPIPath  + platformId + "/" + summonerId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            currentGameInfo = gson.fromJson(new InputStreamReader(is), CurrentGameInfo.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currentGameInfo;
    }

    public FeaturedGames getFeaturedGames() {
        FeaturedGames featuredGames = null;
        try {
            URL url = new URL(observerFeaturedGamesAPIPath + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            featuredGames = gson.fromJson(new InputStreamReader(is), FeaturedGames.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return featuredGames;
    }

    public RecentGamesDto getGame(String summonerId) {
        RecentGamesDto recentGamesDto = null;
        try {
            URL url = new URL(commonAPIPath + "/v1.3/game/by-summoner/" + summonerId + "/recent" + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            recentGamesDto = gson.fromJson(new InputStreamReader(is), RecentGamesDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return recentGamesDto;
    }

    public LeagueList getLeagueBySummonerId(String summonerId) {
        LeagueList leagueList = null;
        try {
            URL url = new URL(commonAPIPath + "/v2.5/league/by-summoner/" + summonerId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            leagueList = gson.fromJson(new InputStreamReader(is), LeagueList.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leagueList;
    }

    public LeagueList getLeagueEntryBySummonerId(String summonerId) {
        LeagueList leagueList = null;
        try {
            URL url = new URL(commonAPIPath + "/v2.5/league/by-summoner/" + summonerId + "/entry?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            leagueList = gson.fromJson(new InputStreamReader(is), LeagueList.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leagueList;
    }

    public LeagueList getLeagueByTeamId(String teamId) {
        LeagueList leagueList = null;
        try {
            URL url = new URL(commonAPIPath + "/v2.5/league/by-team/" + teamId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            leagueList = gson.fromJson(new InputStreamReader(is), LeagueList.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leagueList;
    }

    public LeagueList getLeagueEntryByTeamId(String teamId) {
        LeagueList leagueList = null;
        try {
            URL url = new URL(commonAPIPath + "/v2.5/league/by-team/" + teamId + "/entry?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            leagueList = gson.fromJson(new InputStreamReader(is), LeagueList.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leagueList;
    }

    public LeagueDto getLeagueChallenger() {
        LeagueDto leagueDto = null;
        try {
            URL url = new URL(commonAPIPath + "/v2.5/league/challenger?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            leagueDto = gson.fromJson(new InputStreamReader(is), LeagueDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leagueDto;
    }

    public LeagueDto getLeagueMaster() {
        LeagueDto leagueDto = null;
        try {
            URL url = new URL(commonAPIPath + "/v2.5/league/master?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            leagueDto = gson.fromJson(new InputStreamReader(is), LeagueDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leagueDto;
    }

    public MatchDetail getMatch(String matchId) {
        MatchDetail matchDetail = null;
        try {
            URL url = new URL(commonAPIPath + "/v2.2/match/" + matchId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            matchDetail = gson.fromJson(new InputStreamReader(is), MatchDetail.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return matchDetail;
    }
}
