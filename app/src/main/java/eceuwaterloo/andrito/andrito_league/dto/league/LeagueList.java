package eceuwaterloo.andrito.andrito_league.dto.league;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class LeagueList {
    private HashMap<String, ArrayList<LeagueDto>> leagueList;

    public HashMap<String, ArrayList<LeagueDto>> getLeagueList() {
        return leagueList;
    }

    public void setLeagueList(HashMap<String, ArrayList<LeagueDto>> leagueList) {
        this.leagueList = leagueList;
    }
}
