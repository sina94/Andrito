package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class LevelTipDto {
    private ArrayList<String> effect;
    private ArrayList<String> label;

    public ArrayList<String> getEffect() {
        return effect;
    }

    public void setEffect(ArrayList<String> effect) {
        this.effect = effect;
    }

    public ArrayList<String> getLabel() {
        return label;
    }

    public void setLabel(ArrayList<String> label) {
        this.label = label;
    }
}
