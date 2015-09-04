package eceuwaterloo.andrito.andrito_league.dto.team;

import java.util.ArrayList;

/**
 * Created by Sina Abedi on 9/1/2015.
 */
public class RosterDto {
    private ArrayList<TeamMemberInfoDto> memberList;
    private long ownerId;

    public ArrayList<TeamMemberInfoDto> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<TeamMemberInfoDto> memberList) {
        this.memberList = memberList;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }
}
