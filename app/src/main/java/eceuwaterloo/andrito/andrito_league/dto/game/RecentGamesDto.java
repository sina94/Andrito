package eceuwaterloo.andrito.andrito_league.dto.game;

import java.util.Set;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class RecentGamesDto {
    private Set<GameDto> games;
    private long summonerId;

    public Set<GameDto> getGames() {
        return games;
    }

    public void setGames(Set<GameDto> games) {
        this.games = games;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }
}
