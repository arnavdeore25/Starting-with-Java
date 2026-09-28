import java.util.Scanner;

public class QuizGame extends Game {

    public QuizGame() {
        super("Quiz Game");
    }

    @Override
    public void startGame(Player player) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("\n========================");
        System.out.println("        QUIZ GAME");
        System.out.println("========================");

        System.out.println("\nQ1. Which keyword is used for inheritance?");
        System.out.println("1. this");
        System.out.println("2. extends");
        System.out.println("3. static");
        System.out.println("4. super");

        System.out.print("Your answer: ");
        int answer = sc.nextInt();

        if (answer == 2) {
            System.out.println("Correct!");
            score += 10;
        } else {
            System.out.println("Wrong!");
        }


        System.out.println("\nQ2. Which keyword is used to create an object?");
        System.out.println("1. class");
        System.out.println("2. object");
        System.out.println("3. new");
        System.out.println("4. create");

        System.out.print("Your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            System.out.println("Correct!");
            score += 10;
        } else {
            System.out.println("Wrong!");
        }


        System.out.println("\nQ3. Which keyword refers to the current object?");
        System.out.println("1. super");
        System.out.println("2. this");
        System.out.println("3. current");
        System.out.println("4. self");

        System.out.print("Your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            System.out.println("Correct!");
            score += 10;
        } else {
            System.out.println("Wrong!");
        }


        System.out.println("\nQ4. Which concept allows the same method name with different parameters?");
        System.out.println("1. Inheritance");
        System.out.println("2. Encapsulation");
        System.out.println("3. Method Overloading");
        System.out.println("4. Abstraction");

        System.out.print("Your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            System.out.println("Correct!");
            score += 10;
        } else {
            System.out.println("Wrong!");
        }


        System.out.println("\nQ5. Which keyword is used to call a parent constructor?");
        System.out.println("1. this");
        System.out.println("2. parent");
        System.out.println("3. super");
        System.out.println("4. base");

        System.out.print("Your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            System.out.println("Correct!");
            score += 10;
        } else {
            System.out.println("Wrong!");
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Score: " + score + "/50");

        player.addScore(score);
        player.incrementGames();
    }
}