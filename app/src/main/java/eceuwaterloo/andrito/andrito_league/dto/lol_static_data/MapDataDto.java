package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class MapDataDto {
    private HashMap<String, MapDetailsDto> data;
    private String type;
    private String version;

    public HashMap<String, MapDetailsDto> getData() {
        return data;
    }

    public void setData(HashMap<String, MapDetailsDto> data) {
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
