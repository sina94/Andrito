package eceuwaterloo.andrito.andrito_league.dto.lol_static_data;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/4/2015.
 */
public class MasteryDto {
    private ArrayList<String> description;
    private int id;
    private ImageDto image;
    private String masteryTree; // Legal values: Defense, Offense, Utility
    private String name;
    private String prereq;
    private int ranks;
    private ArrayList<String> sanitizedDescription;

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public String getMasteryTree() {
        return masteryTree;
    }

    public void setMasteryTree(String masteryTree) {
        this.masteryTree = masteryTree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrereq() {
        return prereq;
    }

    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }

    public int getRanks() {
        return ranks;
    }

    public void setRanks(int ranks) {
        this.ranks = ranks;
    }

    public ArrayList<String> getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(ArrayList<String> sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }
}
