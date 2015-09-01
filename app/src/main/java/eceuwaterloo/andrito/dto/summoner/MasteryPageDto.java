package eceuwaterloo.andrito.dto.summoner;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class MasteryPageDto {
    private boolean current;
    private long id;
    private ArrayList<MasteryDto> masteries;
    private String name;

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<MasteryDto> getMasteries() {
        return masteries;
    }

    public void setMasteries(ArrayList<MasteryDto> masteries) {
        this.masteries = masteries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
