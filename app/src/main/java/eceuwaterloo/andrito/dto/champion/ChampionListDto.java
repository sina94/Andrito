package eceuwaterloo.andrito.dto.champion;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class ChampionListDto {
    private ArrayList<ChampionDto> champions;

    public ArrayList<ChampionDto> getChampions() {
        return champions;
    }

    public void setChampions(ArrayList<ChampionDto> champions) {
        this.champions = champions;
    }
}
