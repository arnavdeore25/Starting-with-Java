import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("       GAME HUB");
        System.out.println("========================");

        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        Player player = new Player(name);

        Game game;

        while (true) {

            System.out.println("\n========================");
            System.out.println("          MENU");
            System.out.println("========================");

            System.out.println("1. Number Guessing Game");
            System.out.println("2. Quiz Game");
            System.out.println("3. Player Profile");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    game = new NumberGuessing();
                    game.startGame(player);
                    break;

                case 2:
                    game = new QuizGame();
                    game.startGame(player);
                    break;

                case 3:
                    player.displayProfile();
                    break;

                case 4:
                    System.out.println("\nThanks for playing, " + player.getName() + "!");
                    System.out.println("Final Score: " + player.getScore());
                    System.out.println("Games Played: " + player.getGamesPlayed());
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}