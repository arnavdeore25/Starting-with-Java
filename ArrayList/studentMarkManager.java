import java.util.*;

public class studentMarkManager {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Collection<Integer> marks = new ArrayList<Integer>();
        marks.add(80);
        marks.add(78);
        marks.add(94);
        marks.add(70);
        marks.add(79);
        marks.add(98);
        marks.add(68);
        marks.add(91);
        marks.add(77);
        marks.add(39);
        
        int n = marks.size();
        int sum = 0;
        for(int i : marks){
            sum += i;
        }
        //Add
        System.out.println("Addition "+sum);
        //Display all marks
        System.out.println("All marks: "+marks);
        //Highest & Lowest Marks
        System.out.println("Highest: "+Collections.max(marks)+"\nLowest: "+Collections.min(marks));
        //Average
        System.out.println("Average: "+sum/n);
        //Remove any specific mark
        System.out.println("Which mark you want to remove? ");
        int tempMark = sc.nextInt();
        marks.remove(tempMark);
        System.out.println("After removing:\n"+marks);
        sc.close();
    }
}
