package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class ItemListDto {
    private BasicDataDto basic;
    private HashMap<String, ItemDto> data;
    private ArrayList<GroupDto> groups;
    private ArrayList<ItemTreeDto> tree;
    private String type;
    private String version;

    public BasicDataDto getBasic() {
        return basic;
    }

    public void setBasic(BasicDataDto basic) {
        this.basic = basic;
    }

    public HashMap<String, ItemDto> getData() {
        return data;
    }

    public void setData(HashMap<String, ItemDto> data) {
        this.data = data;
    }

    public ArrayList<GroupDto> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<GroupDto> groups) {
        this.groups = groups;
    }

    public ArrayList<ItemTreeDto> getTree() {
        return tree;
    }

    public void setTree(ArrayList<ItemTreeDto> tree) {
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
