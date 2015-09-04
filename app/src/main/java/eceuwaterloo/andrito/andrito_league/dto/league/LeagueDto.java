package eceuwaterloo.andrito.andrito_league.dto.league;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class LeagueDto {
    private ArrayList<LeagueEntryDto> entries;
    private String name; // This name is an internal place-holder name only. Display and localization of names in the game client are handled client-side.
    private String participantIdSpecifies;
    private String queue; // The league's queue type. (Legal values: RANKED_SOLO_5x5, RANKED_TEAM_3x3, RANKED_TEAM_5x5)
    private String tier; // The league's tier. (Legal values: CHALLENGER, MASTER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE)

    public ArrayList<LeagueEntryDto> getEntries() {
        return entries;
    }

    public void setEntries(ArrayList<LeagueEntryDto> entries) {
        this.entries = entries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParticipantIdSpecifies() {
        return participantIdSpecifies;
    }

    public void setParticipantIdSpecifies(String participantIdSpecifies) {
        this.participantIdSpecifies = participantIdSpecifies;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }
}
