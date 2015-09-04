package eceuwaterloo.andrito.andrito_league.dto.current_game;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class CurrentGameInfo {
    ArrayList<BannedChampion> bannedChampions;
    long gameId;
    long gameLength;
    String gameMode;
    long gameQueueConfigId;
    long gameStartTime;
    String gameType;	//The game type (Legal values: CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME)
    long mapId;
    Observer observers;
    ArrayList<CurrentGameParticipant> participants;
    String platformId;
}
