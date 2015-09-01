package eceuwaterloo.andrito.dto.match;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class Frame {
    private ArrayList<Event> events;
    private HashMap<String, ParticipantFrame> participantFrames;
    private long timestamp;

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public HashMap<String, ParticipantFrame> getParticipantFrames() {
        return participantFrames;
    }

    public void setParticipantFrames(HashMap<String, ParticipantFrame> participantFrames) {
        this.participantFrames = participantFrames;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
