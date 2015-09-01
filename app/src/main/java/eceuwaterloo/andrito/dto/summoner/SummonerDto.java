package eceuwaterloo.andrito.dto.summoner;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class SummonerDto {
    private long id;
    private String name;
    private int profileIconId;
    private long revisionDate; // Date summoner was last modified specified as epoch milliseconds.
                               // The following events will update this timestamp: profile icon change,
                               // playing the tutorial or advanced tutorial, finishing a game, summoner name change
    private long summonerLevel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }
}
