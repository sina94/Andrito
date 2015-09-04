package eceuwaterloo.andrito.andrito_league.dto.matchlist;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class MatchList {
    private int endIndex;
    private ArrayList<MatchReference> matches;
    private int startIndex;
    private int totalGames;

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public ArrayList<MatchReference> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<MatchReference> matches) {
        this.matches = matches;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }
}
