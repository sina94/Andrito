package eceuwaterloo.andrito.andrito_league.dto.summoner;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class SummonerMasteries {
    private HashMap<String, MasteryPagesDto> summonerMasteries;

    public HashMap<String, MasteryPagesDto> getSummonerMasteries() {
        return summonerMasteries;
    }

    public void setSummonerMasteries(HashMap<String, MasteryPagesDto> summonerMasteries) {
        this.summonerMasteries = summonerMasteries;
    }
}
