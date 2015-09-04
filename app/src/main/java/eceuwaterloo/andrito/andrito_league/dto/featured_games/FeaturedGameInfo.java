package eceuwaterloo.andrito.andrito_league.dto.featured_games;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class FeaturedGameInfo {
    private ArrayList<BannedChampion> bannedChampions;
    private long gameId;
    private long gameLength;
    private String gameMode; // The game mode (Legal values: CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD, KINGPORO)
    private long gameQueueConfigId; // The queue type (queue types are documented on the Game Constants page)
    private long gameStartTime;
    private String gameType; // The game type (Legal values: CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME)
    private long mapId;
    private Observer observers;
    private ArrayList<Participant> participants;
    private String platformId;

    public ArrayList<BannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    public void setBannedChampions(ArrayList<BannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getGameLength() {
        return gameLength;
    }

    public void setGameLength(long gameLength) {
        this.gameLength = gameLength;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public void setGameQueueConfigId(long gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }

    public long getGameStartTime() {
        return gameStartTime;
    }

    public void setGameStartTime(long gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public Observer getObservers() {
        return observers;
    }

    public void setObservers(Observer observers) {
        this.observers = observers;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Participant> participants) {
        this.participants = participants;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }
}
