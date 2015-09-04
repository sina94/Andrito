package eceuwaterloo.andrito.andrito_league.dto.lol_status;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class ShardStatus {
    private String hostname;
    private ArrayList<String> locales;
    private String name;
    private String region_tag;
    private ArrayList<Service> services;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion_tag() {
        return region_tag;
    }

    public void setRegion_tag(String region_tag) {
        this.region_tag = region_tag;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
