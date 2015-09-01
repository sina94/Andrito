package eceuwaterloo.andrito.dto.summoner;

import java.util.Set;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class MasteryPagesDto {
    private Set<MasteryPageDto> pages;
    private long summonerId;

    public Set<MasteryPageDto> getPages() {
        return pages;
    }

    public void setPages(Set<MasteryPageDto> pages) {
        this.pages = pages;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }
}
