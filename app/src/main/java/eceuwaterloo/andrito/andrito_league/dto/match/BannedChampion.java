package eceuwaterloo.andrito.andrito_league.dto.match;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class BannedChampion {
    private int championId;
    private int pickTurn;

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public int getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(int pickTurn) {
        this.pickTurn = pickTurn;
    }
}
