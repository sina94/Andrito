package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class MapDetailsDto {
    private ImageDto image;
    private long mapId;
    private String mapName;
    private ArrayList<Long> unpurchasableItemList;

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public ArrayList<Long> getUnpurchasableItemList() {
        return unpurchasableItemList;
    }

    public void setUnpurchasableItemList(ArrayList<Long> unpurchasableItemList) {
        this.unpurchasableItemList = unpurchasableItemList;
    }
}
