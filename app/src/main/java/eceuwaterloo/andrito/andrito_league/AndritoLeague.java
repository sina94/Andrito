package eceuwaterloo.andrito.andrito_league;

/**
 * Created by Sina Abedi on 9/3/2015.
 */
public class AndritoLeague {
    private String riotAPIKey;

    public static enum Region {
        BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR;

        public String toString() {
            return name().toLowerCase();
        }
    }

    public AndritoLeague(String riotAPIKey, Region region) {
        this.riotAPIKey = riotAPIKey;
    }
}
