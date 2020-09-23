
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestTeams {
    Team teams;
    ScoreService scoreService;

    public void setTeams(){
        teams = new Team();
        scoreService = mock(ScoreService.class);
        teams.setScoreService(scoreService);
    }

    public boolean test(){
        List<Player> playersList = new ArrayList<>();
        Player player1 = new Player(1,"Sachin",10);
        Player player2 = new Player(2,"Rahul",20);
        playersList.add(player1);
        playersList.add(player2);

        teams.setPlayersList(playersList);

        when(scoreService.getScore(player1)).thenReturn(109);
        when(scoreService.getScore(player2)).thenReturn(109);
        int total = teams.getTotal();
        if(total == 218){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        TestTeams testMock = new TestTeams();
        testMock.setTeams();
        System.out.println(" "+testMock.test()+" ");
    }
}