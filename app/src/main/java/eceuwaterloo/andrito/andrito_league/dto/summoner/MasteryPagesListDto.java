package eceuwaterloo.andrito.andrito_league.dto.summoner;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class MasteryPagesListDto {
    private HashMap<String, MasteryPagesDto> masteryPagesListDto;

    public HashMap<String, MasteryPagesDto> getMasteryPagesListDto() {
        return masteryPagesListDto;
    }

    public void setMasteryPagesListDto(HashMap<String, MasteryPagesDto> masteryPagesListDto) {
        this.masteryPagesListDto = masteryPagesListDto;
    }
}
