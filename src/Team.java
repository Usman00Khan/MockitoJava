
import java.util.List;

public class Team {
    private ScoreService scoreService;
    private List<Player> playersList;

    public ScoreService getScoreService() {
        return scoreService;
    }

    public void setScoreService(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    public List<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Player> playersList) {
        this.playersList = playersList;
    }

    public int getTotal(){
        int total = 0;
        for (Player players : playersList){
            total += scoreService.getScore(players);
        }
        return total;
    }
}