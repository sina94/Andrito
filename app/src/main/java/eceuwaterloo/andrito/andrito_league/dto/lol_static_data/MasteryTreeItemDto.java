package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class MasteryTreeItemDto {
    private int masteryId;
    private String prereq;

    public int getMasteryId() {
        return masteryId;
    }

    public void setMasteryId(int masteryId) {
        this.masteryId = masteryId;
    }

    public String getPrereq() {
        return prereq;
    }

    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }
}
