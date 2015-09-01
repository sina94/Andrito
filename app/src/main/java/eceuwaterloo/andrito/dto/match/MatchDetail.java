package eceuwaterloo.andrito.dto.match;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class MatchDetail {
    private int mapId;
    private long matchCreation; // Match creation time. Designates when the team select lobby is created and/or the match is made through match making, not when the game actually starts.
    private long matchDuration;
    private long matchId;
    private String matchMode; // Match mode (Legal values: CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD, KINGPORO)
    private String matchType; // Match type (Legal values: CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME)
    private String matchVersion;
    private ArrayList<ParticipantIdentity> participantIdentities;
    private ArrayList<Participant> participants;
    private String platformId;
    private String queueType; // Match queue type (Legal values: CUSTOM, NORMAL_5x5_BLIND, RANKED_SOLO_5x5,
                      // RANKED_PREMADE_5x5, BOT_5x5, NORMAL_3x3, RANKED_PREMADE_3x3, NORMAL_5x5_DRAFT,
                      // ODIN_5x5_BLIND, ODIN_5x5_DRAFT, BOT_ODIN_5x5, BOT_5x5_INTRO, BOT_5x5_BEGINNER,
                      // BOT_5x5_INTERMEDIATE, RANKED_TEAM_3x3, RANKED_TEAM_5x5, BOT_TT_3x3, GROUP_FINDER_5x5,
                      // ARAM_5x5, ONEFORALL_5x5, FIRSTBLOOD_1x1, FIRSTBLOOD_2x2, SR_6x6, URF_5x5,
                      // ONEFORALL_MIRRORMODE_5x5, BOT_URF_5x5, NIGHTMARE_BOT_5x5_RANK1, NIGHTMARE_BOT_5x5_RANK2,
                      // NIGHTMARE_BOT_5x5_RANK5, ASCENSION_5x5, HEXAKILL, BILGEWATER_ARAM_5x5, KING_PORO_5x5,
                      // COUNTER_PICK, BILGEWATER_5x5)
    private String region;
    private String season; // Season match was played (Legal values: PRESEASON3, SEASON3, PRESEASON2014, SEASON2014, PRESEASON2015, SEASON2015)
    private ArrayList<Team> teams;
    private Timeline timeline; // Match timeline data (not included by default)

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public long getMatchCreation() {
        return matchCreation;
    }

    public void setMatchCreation(long matchCreation) {
        this.matchCreation = matchCreation;
    }

    public long getMatchDuration() {
        return matchDuration;
    }

    public void setMatchDuration(long matchDuration) {
        this.matchDuration = matchDuration;
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public String getMatchMode() {
        return matchMode;
    }

    public void setMatchMode(String matchMode) {
        this.matchMode = matchMode;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getMatchVersion() {
        return matchVersion;
    }

    public void setMatchVersion(String matchVersion) {
        this.matchVersion = matchVersion;
    }

    public ArrayList<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(ArrayList<ParticipantIdentity> participantIdentities) {
        this.participantIdentities = participantIdentities;
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

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }
}
