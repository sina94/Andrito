package eceuwaterloo.andrito.dto.lol_status;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class Shard {
    private String hostname;
    private ArrayList<String> locales;
    private String nam;
    private String region_tag;
    private String slug;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public ArrayList<String> getLocales() {
        return locales;
    }

    public void setLocales(ArrayList<String> locales) {
        this.locales = locales;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getRegion_tag() {
        return region_tag;
    }

    public void setRegion_tag(String region_tag) {
        this.region_tag = region_tag;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
