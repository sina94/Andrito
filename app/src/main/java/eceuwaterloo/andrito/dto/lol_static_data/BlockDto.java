package eceuwaterloo.andrito.dto.lol_static_data;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class BlockDto {
    private ArrayList<BlockItemDto> items;
    private boolean recMath;
    private String type;

    public ArrayList<BlockItemDto> getItems() {
        return items;
    }

    public void setItems(ArrayList<BlockItemDto> items) {
        this.items = items;
    }

    public boolean isRecMath() {
        return recMath;
    }

    public void setRecMath(boolean recMath) {
        this.recMath = recMath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
