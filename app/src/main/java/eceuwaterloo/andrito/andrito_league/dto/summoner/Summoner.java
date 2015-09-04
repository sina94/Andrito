package eceuwaterloo.andrito.andrito_league.dto.summoner;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class Summoner {
    private HashMap<String, SummonerDto> summoner;

    public HashMap<String, SummonerDto> getSummoner() {
        return summoner;
    }

    public void setSummoner(HashMap<String, SummonerDto> summonerListDto) {
        this.summoner = summonerListDto;
    }
}
