package eceuwaterloo.andrito.andrito_league.dto.stats.ranked;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class RankedStatsDto {
    private ArrayList<ChampionStatsDto> champions;
    private long modifyDate;
    private long summonerId;

    public ArrayList<ChampionStatsDto> getChampions() {
        return champions;
    }

    public void setChampions(ArrayList<ChampionStatsDto> champions) {
        this.champions = champions;
    }

    public long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }
}
