package eceuwaterloo.andrito.andrito_league.dto.team;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class TeamDto {
    private long createDate;
    private String fullId;
    private long lastGameDate;
    private long lastJoinDate;
    private long lastJoinedRankedTeamQueueDate;
    private ArrayList<MatchHistorySummaryDto> matchHistory;
    private long modifyDate;
    private String name;
    private RosterDto roster;
    private long secondLastJoinDate;
    private String status;
    private String tag;
    private ArrayList<TeamStatDetailDto> teamStatDetails;
    private long thirdLastJoinDate;

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public String getFullId() {
        return fullId;
    }

    public void setFullId(String fullId) {
        this.fullId = fullId;
    }

    public long getLastGameDate() {
        return lastGameDate;
    }

    public void setLastGameDate(long lastGameDate) {
        this.lastGameDate = lastGameDate;
    }

    public long getLastJoinDate() {
        return lastJoinDate;
    }

    public void setLastJoinDate(long lastJoinDate) {
        this.lastJoinDate = lastJoinDate;
    }

    public long getLastJoinedRankedTeamQueueDate() {
        return lastJoinedRankedTeamQueueDate;
    }

    public void setLastJoinedRankedTeamQueueDate(long lastJoinedRankedTeamQueueDate) {
        this.lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate;
    }

    public ArrayList<MatchHistorySummaryDto> getMatchHistory() {
        return matchHistory;
    }

    public void setMatchHistory(ArrayList<MatchHistorySummaryDto> matchHistory) {
        this.matchHistory = matchHistory;
    }

    public long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RosterDto getRoster() {
        return roster;
    }

    public void setRoster(RosterDto roster) {
        this.roster = roster;
    }

    public long getSecondLastJoinDate() {
        return secondLastJoinDate;
    }

    public void setSecondLastJoinDate(long secondLastJoinDate) {
        this.secondLastJoinDate = secondLastJoinDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ArrayList<TeamStatDetailDto> getTeamStatDetails() {
        return teamStatDetails;
    }

    public void setTeamStatDetails(ArrayList<TeamStatDetailDto> teamStatDetails) {
        this.teamStatDetails = teamStatDetails;
    }

    public long getThirdLastJoinDate() {
        return thirdLastJoinDate;
    }

    public void setThirdLastJoinDate(long thirdLastJoinDate) {
        this.thirdLastJoinDate = thirdLastJoinDate;
    }
}
