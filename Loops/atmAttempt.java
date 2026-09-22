import java.util.*;
public class atmAttempt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        int userPin; 
        for (int i = 3; i >= 1 ; i--) 
        {
            System.out.println("Enter pin:");
            userPin = sc.nextInt();
            if(userPin == pin){
                System.out.println("Access Granted!!");
                System.exit(1);
            }
            else {
                System.out.println((i-1)+" atempt reamining!");
            }

        }
    }
}
