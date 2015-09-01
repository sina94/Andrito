package eceuwaterloo.andrito;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class ChampionListDto {
    private HashMap<String, ChampionDto> data;
    private String type;
    private String version;

    public HashMap<String, ChampionDto> getData() {
        return data;
    }

    public void setData(HashMap<String, ChampionDto> data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
