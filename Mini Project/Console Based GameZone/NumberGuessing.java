import java.util.Scanner;

public class NumberGuessing extends Game {

    public NumberGuessing() {
        super("Number Guessing Game");
    }

    @Override
    public void startGame(Player player) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 57;
        int attempts = 0;

        System.out.println("\n========================");
        System.out.println("   NUMBER GUESSING");
        System.out.println("========================");

        System.out.println("Guess a number between 1 and 100.");

        while (true) {

            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            attempts++;

            if (guess == secretNumber) {

                System.out.println("Correct!");
                System.out.println("Attempts: " + attempts);

                if (attempts <= 3) {
                    System.out.println("+30 points");
                    player.addScore(30);
                } else if (attempts <= 6) {
                    System.out.println("+20 points");
                    player.addScore(20);
                } else {
                    System.out.println("+10 points");
                    player.addScore(10);
                }

                break;

            } else if (guess < secretNumber) {

                System.out.println("Too Low!");

            } else {

                System.out.println("Too High!");
            }
        }

        player.incrementGames();
    }
}