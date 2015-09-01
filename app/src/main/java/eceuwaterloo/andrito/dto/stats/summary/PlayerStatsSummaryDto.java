package eceuwaterloo.andrito.dto.stats.summary;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class PlayerStatsSummaryDto {
    private AggregatedStatsDto	aggregatedStats;
    private int losses; // Number of losses for this queue type. Returned for ranked queue types only.
    private long modifyDate;
    private String playerStatSummaryType; // Player stats summary type.
                                          // (Legal values: AramUnranked5x5, Ascension, CAP5x5,
                                          // CoopVsAI, CoopVsAI3x3, CounterPick, FirstBlood1x1,
                                          // FirstBlood2x2, Hexakill,  KingPoro, NightmareBot,
                                          // OdinUnranked, OneForAll5x5, RankedPremade3x3,
                                          // RankedPremade5x5, RankedSolo5x5, RankedTeam3x3,
                                          // RankedTeam5x5, SummonersRift6x6, Unranked, Unranked3x3,
                                          // URF, URFBots, Bilgewater)
    private int wins; // Number of wins for this queue type.

    public AggregatedStatsDto getAggregatedStats() {
        return aggregatedStats;
    }

    public void setAggregatedStats(AggregatedStatsDto aggregatedStats) {
        this.aggregatedStats = aggregatedStats;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getPlayerStatSummaryType() {
        return playerStatSummaryType;
    }

    public void setPlayerStatSummaryType(String playerStatSummaryType) {
        this.playerStatSummaryType = playerStatSummaryType;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
