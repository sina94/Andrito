package eceuwaterloo.andrito.andrito_league.dto.summoner;

import java.util.Set;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class RunePagesDto {
    private Set<RunePageDto> pages;
    private long summonerId;

    public Set<RunePageDto> getPages() {
        return pages;
    }

    public void setPages(Set<RunePageDto> pages) {
        this.pages = pages;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }
}
