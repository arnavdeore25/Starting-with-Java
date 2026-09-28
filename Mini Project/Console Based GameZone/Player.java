public class Player 
{
    private String name;
    private int score;
    private int gamesPlayed;

    public Player(String name) 
    {
        this.name = name;
        this.score = 0;
        this.gamesPlayed = 0;
    }

    public void addScore(int points) 
    {
        score += points;
    }

    public void incrementGames() 
    {
        gamesPlayed++;
    }

    public String getName() 
    {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getGamesPlayed() 
    {
        return gamesPlayed;
    }

    public void displayProfile() 
    {
        System.out.println("\n========================");
        System.out.println("       PLAYER PROFILE");
        System.out.println("========================");
        System.out.println("Name: "+name);
        System.out.println("Games Played: "+gamesPlayed);
        System.out.println("Total Score: "+score);
        System.out.println("========================");
    }
}