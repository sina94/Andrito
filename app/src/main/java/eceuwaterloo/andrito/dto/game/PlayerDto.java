package eceuwaterloo.andrito.dto.game;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class PlayerDto {
    private int championId;
    private long summonerId;
    private int teamId;

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
