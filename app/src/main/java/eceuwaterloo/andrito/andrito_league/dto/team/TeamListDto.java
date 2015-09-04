package eceuwaterloo.andrito.andrito_league.dto.team;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class TeamListDto {
    private HashMap<String, ArrayList<TeamDto>> teamListDto;

    public HashMap<String, ArrayList<TeamDto>> getTeamListDto() {
        return teamListDto;
    }

    public void setTeamListDto(HashMap<String, ArrayList<TeamDto>> teamListDto) {
        this.teamListDto = teamListDto;
    }
}
