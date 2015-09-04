package eceuwaterloo.andrito.andrito_league.dto.league;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class MiniSeriesDto {
    private int losses;
    private String progress; // String showing the current, sequential mini series progress where 'W' represents a win, 'L' represents a loss, and 'N' represents a game that hasn't been played yet.
    private int target; // Number of wins required for promotion.
    private int wins; // Number of current wins in the mini series.

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
