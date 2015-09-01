package eceuwaterloo.andrito.dto.match;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class Timeline {
    private long frameInterval; // Time between each returned frame in milliseconds.
    private ArrayList<Frame> frames;

    public long getFrameInterval() {
        return frameInterval;
    }

    public void setFrameInterval(long frameInterval) {
        this.frameInterval = frameInterval;
    }

    public ArrayList<Frame> getFrames() {
        return frames;
    }

    public void setFrames(ArrayList<Frame> frames) {
        this.frames = frames;
    }
}
