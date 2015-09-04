package eceuwaterloo.andrito.andrito_league.dto.matchhistory;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class PlayerHistory {
    private ArrayList<MatchSummary> matches;

    public ArrayList<MatchSummary> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<MatchSummary> matches) {
        this.matches = matches;
    }
}
