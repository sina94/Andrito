package eceuwaterloo.andrito.dto.stats.ranked;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class ChampionStatsDto {
    private int id; // Champion ID. Note that champion ID 0 represents the combined stats for all champions.
    private AggregatedStatsDto stats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AggregatedStatsDto getStats() {
        return stats;
    }

    public void setStats(AggregatedStatsDto stats) {
        this.stats = stats;
    }
}
