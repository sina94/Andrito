package eceuwaterloo.andrito.andrito_league.dto.stats.summary;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class PlayerStatsSummaryListDto {
    private ArrayList<PlayerStatsSummaryDto> playerStatSummaries;
    private long summonerId;

    public ArrayList<PlayerStatsSummaryDto> getPlayerStatSummaries() {
        return playerStatSummaries;
    }

    public void setPlayerStatSummaries(ArrayList<PlayerStatsSummaryDto> playerStatSummaries) {
        this.playerStatSummaries = playerStatSummaries;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }
}
