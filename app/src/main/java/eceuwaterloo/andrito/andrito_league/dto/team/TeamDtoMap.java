package eceuwaterloo.andrito.andrito_league.dto.team;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class TeamDtoMap {
    private HashMap<String, TeamDto> teamDtoMap;

    public HashMap<String, TeamDto> getTeamDtoMap() {
        return teamDtoMap;
    }

    public void setTeamDtoMap(HashMap<String, TeamDto> teamDtoMap) {
        this.teamDtoMap = teamDtoMap;
    }
}
