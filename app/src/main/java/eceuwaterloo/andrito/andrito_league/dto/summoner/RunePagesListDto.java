package eceuwaterloo.andrito.andrito_league.dto.summoner;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class RunePagesListDto {
    private HashMap<String, RunePagesDto> runePagesListDto;

    public HashMap<String, RunePagesDto> getRunePagesListDto() {
        return runePagesListDto;
    }

    public void setRunePagesListDto(HashMap<String, RunePagesDto> runePagesListDto) {
        this.runePagesListDto = runePagesListDto;
    }
}
