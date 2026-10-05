import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class studentSearch {
    public static void main(String args[]) {
        int flag = 1;
        Scanner sc = new Scanner(System.in);
        Collection<String> names = new ArrayList<String>();
        names.add("Arnav");
        names.add("Saniya");
        names.add("Yamini");
        names.add("Prem");
        names.add("Animesh");
        names.add("Jeet");

        System.out.println("Enter name to search: ");
        String searchKey = sc.next();
        for(String s: names) {
            if(s.equalsIgnoreCase(searchKey)) {
                flag = 0;
                break;
            }
        }
        if(flag == 0) 
            System.out.println(searchKey+" Found");
        else
            System.out.println(searchKey+" not Found");

        sc.close();
        
    }
}
