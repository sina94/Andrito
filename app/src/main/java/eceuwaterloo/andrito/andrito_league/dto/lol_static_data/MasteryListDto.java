package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class MasteryListDto {
    private HashMap<String, MasteryDto> data;
    private MasteryTreeDto tree;
    private String type;
    private String version;

    public HashMap<String, MasteryDto> getData() {
        return data;
    }

    public void setData(HashMap<String, MasteryDto> data) {
        this.data = data;
    }

    public MasteryTreeDto getTree() {
        return tree;
    }

    public void setTree(MasteryTreeDto tree) {
        this.tree = tree;
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
