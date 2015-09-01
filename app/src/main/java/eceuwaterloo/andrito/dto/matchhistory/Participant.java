package eceuwaterloo.andrito.dto.matchhistory;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class Participant {
    private int championId;
    private int highestAchievedSeasonTier; // Highest ranked tier achieved for the previous season, if any, otherwise null.
                                   // Used to display border in game loading screen.
                                   // (Legal values: CHALLENGER, MASTER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE, UNRANKED)
    private ArrayList<Mastery> masteries;
    private int participantId;
    private ArrayList<Rune> runes;
    private int spell1Id;
    private int spell2Id;
    private ParticipantStats stats;
    private int teamId;
    private ParticipantTimeline timeline; // Timeline data. Delta fields refer to values for the
                                          // specified period (e.g., the gold per minute over the first 10 minutes of
                                          // the game versus the second 20 minutes of the game. Diffs fields refer to
                                          // the deltas versus the calculated lane opponent(s).

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public int getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public void setHighestAchievedSeasonTier(int highestAchievedSeasonTier) {
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
    }

    public ArrayList<Mastery> getMasteries() {
        return masteries;
    }

    public void setMasteries(ArrayList<Mastery> masteries) {
        this.masteries = masteries;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public ArrayList<Rune> getRunes() {
        return runes;
    }

    public void setRunes(ArrayList<Rune> runes) {
        this.runes = runes;
    }

    public int getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(int spell1Id) {
        this.spell1Id = spell1Id;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(int spell2Id) {
        this.spell2Id = spell2Id;
    }

    public ParticipantStats getStats() {
        return stats;
    }

    public void setStats(ParticipantStats stats) {
        this.stats = stats;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public ParticipantTimeline getTimeline() {
        return timeline;
    }

    public void setTimeline(ParticipantTimeline timeline) {
        this.timeline = timeline;
    }
}
