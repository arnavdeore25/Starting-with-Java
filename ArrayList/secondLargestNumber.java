import java.util.ArrayList;
import java.util.Collections;

public class secondLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(25);
        numbers.add(15);
        numbers.add(40);
        numbers.add(25);
        numbers.add(30);

        Collections.sort(numbers);

        int largest = numbers.get(numbers.size() - 1);
        int secondLargest = 0;

        for (int i = numbers.size() - 2; i >= 0; i--) {
            if (numbers.get(i) != largest) {
                secondLargest = numbers.get(i);
                break;
            }
        }

        System.out.println("Second largest = " + secondLargest);
    }
}