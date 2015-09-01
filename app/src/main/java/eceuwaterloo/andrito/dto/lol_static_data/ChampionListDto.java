package eceuwaterloo.andrito.dto.lol_static_data;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class ChampionListDto {
    private HashMap<String, ChampionDto> data;
    private String format;
    private HashMap<String, String> keys;
    private String type;
    private String version;

    public HashMap<String, ChampionDto> getData() {
        return data;
    }

    public void setData(HashMap<String, ChampionDto> data) {
        this.data = data;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public HashMap<String, String> getKeys() {
        return keys;
    }

    public void setKeys(HashMap<String, String> keys) {
        this.keys = keys;
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
