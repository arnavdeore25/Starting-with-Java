public class Game {

    protected String gameName;

    public Game(String gameName) {
        this.gameName = gameName;
    }

    public void startGame(Player player) {
        System.out.println("Starting " + gameName + "...");
    }
}