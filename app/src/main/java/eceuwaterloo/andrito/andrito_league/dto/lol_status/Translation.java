package eceuwaterloo.andrito.andrito_league.dto.lol_status;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class Translation {
    private String content;
    private String locale;
    private String updated_at;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
