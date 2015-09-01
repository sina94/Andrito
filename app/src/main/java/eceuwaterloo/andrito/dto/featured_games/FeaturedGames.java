package eceuwaterloo.andrito.dto.featured_games;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class FeaturedGames {
    private long clientRefreshInterval;
    private ArrayList<FeaturedGameInfo> gameList;

    public long getClientRefreshInterval() {
        return clientRefreshInterval;
    }

    public void setClientRefreshInterval(long clientRefreshInterval) {
        this.clientRefreshInterval = clientRefreshInterval;
    }

    public ArrayList<FeaturedGameInfo> getGameList() {
        return gameList;
    }

    public void setGameList(ArrayList<FeaturedGameInfo> gameList) {
        this.gameList = gameList;
    }
}
