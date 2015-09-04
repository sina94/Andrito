package eceuwaterloo.andrito.andrito_league.dto.lol_status;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class Service {
    ArrayList<Incident> incidents;
    String name;
    String slug;
    String status; // Legal values: Online, Alert, Offline, Deploying
}
