import java.util.Scanner;

public class carParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSpaces = 10;
        int occupiedSpaces = 0;
        int choice;
        while (true) {
            System.out.println("\n1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Show Available Spaces");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (occupiedSpaces < totalSpaces) {
                        occupiedSpaces++;
                        System.out.println("Vehicle parked successfully.");
                    } else
                        System.out.println("Parking lot is full.");
                    break;
                case 2:
                    if (occupiedSpaces > 0) {
                        occupiedSpaces--;
                        System.out.println("Vehicle removed successfully.");
                    } else
                        System.out.println("Parking lot is empty.");
                    break;
                case 3:
                    System.out.println("Available spaces: "+(totalSpaces-occupiedSpaces));
                    break;
                case 4:
                    System.exit(1);
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option seleted");
            }
        }
    }
}