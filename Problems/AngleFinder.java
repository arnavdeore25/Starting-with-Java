/*
Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.
*/

import java.util.Scanner;

public class AngleFinder {
    public static double angleClock(int hour, int minutes) {
        double minute = minutes * 6.0;
        double hour2 = (hour % 12) * 30.0 + minutes * 0.5;
        double diff = Math.abs(hour2 - minute);
        return Math.min(diff, 360.0 - diff);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour (1-12):");
        int hour = scanner.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();
        double result = angleClock(hour, minutes);
        System.out.println("The angle between the hands = "+result+" degrees");
        
        scanner.close();
    }
}
