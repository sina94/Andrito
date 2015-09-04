package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class MasteryTreeListDto {
    private ArrayList<MasteryTreeItemDto> masteryTreeItems;

    public ArrayList<MasteryTreeItemDto> getMasteryTreeItems() {
        return masteryTreeItems;
    }

    public void setMasteryTreeItems(ArrayList<MasteryTreeItemDto> masteryTreeItems) {
        this.masteryTreeItems = masteryTreeItems;
    }
}
