import java.util.Arrays;

/**
 * Created by BHarris on 1/30/17.
 *
 * This is a basketball player class, it will keep up with some team stats, and has a max limit of 5
 * players per team.
 *
 */
public class BasketballTeam {
    private String[] players;
    private String teamName;
    private int totalPoints;
    private int totalAssists;
    private int countOfPlayers;



    public BasketballTeam(String teamName) {
        this.players = new String[5];
        this.teamName = teamName;
    }

    //overloaded, if you have stats already
    public BasketballTeam(String teamName, int totalPoints, int totalAssists) {
        this.players = new String[5];
    }

    public void addPoints(int points) {
        this.totalPoints += points;
    }

    public void addAssists(int assists) {
        this.totalAssists += assists;
    }

    public void addPlayer(String playerName) {


        if (countOfPlayers <= 4) {
            players[this.countOfPlayers] = playerName;
        }

        this.countOfPlayers++;

    }

    public int getPoints(){
        return this.totalPoints;
    }

    public int getAssists(){
        return this.totalAssists;
    }

    public String getPlayer() {
        return Arrays.toString(players);
    }
}
