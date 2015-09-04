package eceuwaterloo.andrito.andrito_league;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import eceuwaterloo.andrito.andrito_league.dto.champion.ChampionDto;
import eceuwaterloo.andrito.andrito_league.dto.champion.ChampionListDto;
import eceuwaterloo.andrito.andrito_league.dto.current_game.CurrentGameInfo;
import eceuwaterloo.andrito.andrito_league.dto.featured_games.FeaturedGames;
import eceuwaterloo.andrito.andrito_league.dto.game.RecentGamesDto;
import eceuwaterloo.andrito.andrito_league.dto.league.LeagueDto;
import eceuwaterloo.andrito.andrito_league.dto.league.LeagueList;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.ItemDto;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.ItemListDto;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.LanguageStringsDto;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.Languages;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.MasteryListDto;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.RealmDto;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.RuneDto;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.RuneListDto;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.SummonerSpellDto;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.SummonerSpellListDto;
import eceuwaterloo.andrito.andrito_league.dto.lol_static_data.Versions;
import eceuwaterloo.andrito.andrito_league.dto.lol_status.ShardStatus;
import eceuwaterloo.andrito.andrito_league.dto.lol_status.Shards;
import eceuwaterloo.andrito.andrito_league.dto.match.MatchDetail;
import eceuwaterloo.andrito.andrito_league.dto.matchhistory.PlayerHistory;
import eceuwaterloo.andrito.andrito_league.dto.matchlist.MatchList;
import eceuwaterloo.andrito.andrito_league.dto.stats.ranked.RankedStatsDto;
import eceuwaterloo.andrito.andrito_league.dto.stats.summary.PlayerStatsSummaryListDto;
import eceuwaterloo.andrito.andrito_league.dto.summoner.MasteryPagesListDto;
import eceuwaterloo.andrito.andrito_league.dto.summoner.RunePagesListDto;
import eceuwaterloo.andrito.andrito_league.dto.summoner.SummonerNames;
import eceuwaterloo.andrito.andrito_league.dto.summoner.Summoners;
import eceuwaterloo.andrito.andrito_league.dto.team.TeamDtoMap;
import eceuwaterloo.andrito.andrito_league.dto.team.TeamListDto;

/**
 * Created by Sina Abedi on 9/3/2015.
 */
public class AndritoLeague {
    private String riotAPIKey;
    private String commonAPIPath;
    private String observerCurrentGameAPIPath;
    private String observerFeaturedGamesAPIPath;
    private String staticDataAPIPath;
    private String shardsAPIPath;
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
        staticDataAPIPath = "https://global.api.pvp.net/api/lol/static-data/" + this.region;
        shardsAPIPath = "http://status.leagueoflegends.com/shards/";
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

    public eceuwaterloo.andrito.andrito_league.dto.lol_static_data.ChampionListDto getLoLStaticDataChampion() {
        eceuwaterloo.andrito.andrito_league.dto.lol_static_data.ChampionListDto championListDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/champion?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            championListDto = gson.fromJson(new InputStreamReader(is), eceuwaterloo.andrito.andrito_league.dto.lol_static_data.ChampionListDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return championListDto;
    }

    public eceuwaterloo.andrito.andrito_league.dto.lol_static_data.ChampionDto getLoLStaticDataChampionById(String championId) {
        eceuwaterloo.andrito.andrito_league.dto.lol_static_data.ChampionDto championDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/champion/" + championId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            championDto = gson.fromJson(new InputStreamReader(is), eceuwaterloo.andrito.andrito_league.dto.lol_static_data.ChampionDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return championDto;
    }

    public ItemListDto getLoLStaticDataItem() {
        ItemListDto itemListDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/item?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            itemListDto = gson.fromJson(new InputStreamReader(is), ItemListDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemListDto;
    }

    public ItemDto getLoLStaticDataItemById(String itemId) {
        ItemDto itemDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/item/" + itemId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            itemDto = gson.fromJson(new InputStreamReader(is), ItemDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemDto;
    }

    public LanguageStringsDto getLoLStaticDataLanguageStrings() {
        LanguageStringsDto languageStringsDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/language-strings?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            languageStringsDto = gson.fromJson(new InputStreamReader(is), LanguageStringsDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return languageStringsDto;
    }

    public Languages getLoLStaticDataLanguages() {
        Languages languages = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/languages?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            languages = gson.fromJson(new InputStreamReader(is), Languages.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return languages;
    }

    public MasteryListDto getLoLStaticDataMastery() {
        MasteryListDto masteryListDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/mastery?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            masteryListDto = gson.fromJson(new InputStreamReader(is), MasteryListDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return masteryListDto;
    }

    public eceuwaterloo.andrito.andrito_league.dto.lol_static_data.MasteryDto getLoLStaticDataMasteryById(String masteryId) {
        eceuwaterloo.andrito.andrito_league.dto.lol_static_data.MasteryDto masteryDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/mastery/" + masteryId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            masteryDto = gson.fromJson(new InputStreamReader(is), eceuwaterloo.andrito.andrito_league.dto.lol_static_data.MasteryDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return masteryDto;
    }

    public RealmDto getLoLStaticDataRealm() {
        RealmDto realmDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/realm?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            realmDto = gson.fromJson(new InputStreamReader(is), RealmDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return realmDto;
    }

    public RuneListDto getLoLStaticDataRune() {
        RuneListDto runeListDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/rune?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            runeListDto = gson.fromJson(new InputStreamReader(is), RuneListDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return runeListDto;
    }

    public RuneDto getLoLStaticDataRuneById(String runeId) {
        RuneDto runeDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/rune/" + runeId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            runeDto = gson.fromJson(new InputStreamReader(is), RuneDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return runeDto;
    }

    public SummonerSpellListDto getLoLStaticDataSummonerSpell() {
        SummonerSpellListDto summonerSpellListDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/summoner-spell?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            summonerSpellListDto = gson.fromJson(new InputStreamReader(is), SummonerSpellListDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return summonerSpellListDto;
    }

    public SummonerSpellDto getLoLStaticDataSummonerSpellById(String summonerSpellId) {
        SummonerSpellDto summonerSpellDto = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/summoner-spell/" + summonerSpellId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            summonerSpellDto = gson.fromJson(new InputStreamReader(is), SummonerSpellDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return summonerSpellDto;
    }

    public Versions getLoLStaticDataVersions() {
        Versions versions = null;
        try {
            URL url = new URL(staticDataAPIPath + "/v1.2/versions?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            versions = gson.fromJson(new InputStreamReader(is), Versions.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return versions;
    }

    public Shards getLoLStatusShards() {
        Shards shards = null;
        try {
            URL url = new URL(shardsAPIPath + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            shards = gson.fromJson(new InputStreamReader(is), Shards.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return shards;
    }

    public ShardStatus getLoLStatusShardStatus(Region region) {
        ShardStatus shardStatus = null;
        try {
            URL url = new URL(shardsAPIPath + region.toString());
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            shardStatus = gson.fromJson(new InputStreamReader(is), ShardStatus.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return shardStatus;
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

    public PlayerHistory getMatchHistory(String summonerId) {
        PlayerHistory playerHistory = null;
        try {
            URL url = new URL(commonAPIPath + "/v2.2/matchhistory/" + summonerId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            playerHistory = gson.fromJson(new InputStreamReader(is), PlayerHistory.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return playerHistory;
    }

    public MatchList getMatchList(String summonerId) {
        MatchList matchList = null;
        try {
            URL url = new URL(commonAPIPath + "/v2.2/matchlist/by-summoner/" + summonerId + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            matchList = gson.fromJson(new InputStreamReader(is), MatchList.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return matchList;
    }

    public RankedStatsDto getStatsRanked(String summonerId) {
        RankedStatsDto rankedStatsDto = null;
        try {
            URL url = new URL(commonAPIPath + "/v1.3/stats/by-summoner/" + summonerId + "/ranked?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            rankedStatsDto = gson.fromJson(new InputStreamReader(is), RankedStatsDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rankedStatsDto;
    }

    public PlayerStatsSummaryListDto getStatsSummary(String summonerId) {
        PlayerStatsSummaryListDto playerStatsSummaryListDto = null;
        try {
            URL url = new URL(commonAPIPath + "/v1.3/stats/by-summoner/" + summonerId + "/summary?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            playerStatsSummaryListDto = gson.fromJson(new InputStreamReader(is), PlayerStatsSummaryListDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return playerStatsSummaryListDto;
    }

    public Summoners getSummonerByNames(ArrayList<String> summonerNamesArray) {
        Summoners summoners = null;
        StringBuilder summonerNames = parseWhiteSpaces(summonerNamesArray);
        try {
            URL url = new URL(commonAPIPath + "/v1.4/summoner/by-name/" + summonerNames + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            summoners = gson.fromJson(new InputStreamReader(is), Summoners.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return summoners;
    }

    public Summoners getSummonerByIds(ArrayList<String> summonerIdsArray) {
        Summoners summoners = null;
        StringBuilder summonerIds = parseWhiteSpaces(summonerIdsArray);
        try {
            URL url = new URL(commonAPIPath + "/v1.4/summoner/" + summonerIds + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            summoners = gson.fromJson(new InputStreamReader(is), Summoners.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return summoners;
    }

    public MasteryPagesListDto getSummonerMasteriesByIds(ArrayList<String> summonerIdsArray) {
        MasteryPagesListDto masteryPagesListDto = null;
        StringBuilder summonerIds = parseWhiteSpaces(summonerIdsArray);
        try {
            URL url = new URL(commonAPIPath + "/v1.4/summoner/" + summonerIds + "/masteries?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            masteryPagesListDto = gson.fromJson(new InputStreamReader(is), MasteryPagesListDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return masteryPagesListDto;
    }

    public SummonerNames getSummonerNamesByIds(ArrayList<String> summonerIdsArray) {
        SummonerNames summonerNames = null;
        StringBuilder summonerIds = parseWhiteSpaces(summonerIdsArray);
        try {
            URL url = new URL(commonAPIPath + "/v1.4/summoner/" + summonerIds + "/name?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            summonerNames = gson.fromJson(new InputStreamReader(is), SummonerNames.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return summonerNames;
    }

    public RunePagesListDto getRunePagesByIds(ArrayList<String> summonerIdsArray) {
        RunePagesListDto runePagesListDto = null;
        StringBuilder summonerIds = parseWhiteSpaces(summonerIdsArray);
        try {
            URL url = new URL(commonAPIPath + "/v1.4/summoner/" + summonerIds + "/runes?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            runePagesListDto = gson.fromJson(new InputStreamReader(is), RunePagesListDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return runePagesListDto;
    }

    public TeamListDto getTeamsBySummonerIds(ArrayList<String> summonerIdsArray) {
        TeamListDto teamListDto = null;
        StringBuilder summonerIds = parseWhiteSpaces(summonerIdsArray);
        try {
            URL url = new URL(commonAPIPath + "/v2.4/team/by-summoner/" + summonerIds + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            teamListDto = gson.fromJson(new InputStreamReader(is), TeamListDto.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return teamListDto;
    }

    public TeamDtoMap getTeamsByTeamIds(ArrayList<String> teamIdsArray) {
        TeamDtoMap teamDtoMap = null;
        StringBuilder teamIds = parseWhiteSpaces(teamIdsArray);
        try {
            URL url = new URL(commonAPIPath + "/v2.4/team/" + teamIds + "?api_key=" + riotAPIKey);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            teamDtoMap = gson.fromJson(new InputStreamReader(is), TeamDtoMap.class);
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return teamDtoMap;
    }

    private StringBuilder parseWhiteSpaces(ArrayList<String> stringArray) {
        StringBuilder teamIds = new StringBuilder();
        for (int i = 0; i < stringArray.size(); ++i) {
            if (i < stringArray.size() - 1) {
                teamIds.append(stringArray.get(i).replaceAll(" ", "%20") + ",");
            }
            else {
                teamIds.append(stringArray.get(i).replaceAll(" ", "%20"));
            }
        }
        return teamIds;
    }
}
