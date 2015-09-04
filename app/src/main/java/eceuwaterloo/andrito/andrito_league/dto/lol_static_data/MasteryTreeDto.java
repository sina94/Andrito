package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class MasteryTreeDto {
    private ArrayList<MasteryTreeListDto> Defense;
    private ArrayList<MasteryTreeListDto> Offense;
    private ArrayList<MasteryTreeListDto> Utility;

    public ArrayList<MasteryTreeListDto> getDefense() {
        return Defense;
    }

    public void setDefense(ArrayList<MasteryTreeListDto> defense) {
        Defense = defense;
    }

    public ArrayList<MasteryTreeListDto> getOffense() {
        return Offense;
    }

    public void setOffense(ArrayList<MasteryTreeListDto> offense) {
        Offense = offense;
    }

    public ArrayList<MasteryTreeListDto> getUtility() {
        return Utility;
    }

    public void setUtility(ArrayList<MasteryTreeListDto> utility) {
        Utility = utility;
    }
}
