package eceuwaterloo.andrito.dto.lol_status;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class Message {
    private String author;
    private String content;
    private String created_at;
    private long id;
    private String severity; // Legal values: Info, Alert, Error
    private ArrayList<Translation> translations;
    private String updated_at;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ArrayList<Translation> getTranslations() {
        return translations;
    }

    public void setTranslations(ArrayList<Translation> translations) {
        this.translations = translations;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
