package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class RecommendedDto {
    private ArrayList<BlockDto> blocks;
    private String champion;
    private String map;
    private String mode;
    private boolean priority;
    private String title;
    private String type;

    public ArrayList<BlockDto> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<BlockDto> blocks) {
        this.blocks = blocks;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
