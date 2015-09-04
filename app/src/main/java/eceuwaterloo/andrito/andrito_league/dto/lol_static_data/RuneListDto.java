package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class RuneListDto {
    private BasicDataDto basic;
    private HashMap<String, RuneDto> data;
    private String type;
    private String version;

    public BasicDataDto getBasic() {
        return basic;
    }

    public void setBasic(BasicDataDto basic) {
        this.basic = basic;
    }

    public HashMap<String, RuneDto> getData() {
        return data;
    }

    public void setData(HashMap<String, RuneDto> data) {
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
