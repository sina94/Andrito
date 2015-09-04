package eceuwaterloo.andrito.andrito_league.dto.lol_status;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class Incident {
    private boolean active;
    private String created_at;
    private long id;
    private ArrayList<Message> updates;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Message> getUpdates() {
        return updates;
    }

    public void setUpdates(ArrayList<Message> updates) {
        this.updates = updates;
    }
}
