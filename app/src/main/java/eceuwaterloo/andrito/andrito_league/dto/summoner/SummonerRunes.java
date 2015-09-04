package eceuwaterloo.andrito.andrito_league.dto.summoner;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class SummonerRunes {
    private HashMap<String, RunePagesDto> summonerRunes;

    public HashMap<String, RunePagesDto> getSummonerRunes() {
        return summonerRunes;
    }

    public void setSummonerRunes(HashMap<String, RunePagesDto> summonerRunes) {
        this.summonerRunes = summonerRunes;
    }
}
