import java.util.*;

public class duplicateString {
    public static void main(String args[]) {
        Collection<String> names = new ArrayList<String>();
        names.add("Arnav");
        names.add("Saniya");
        names.add("Yamini");
        names.add("Prem");
        names.add("Saniya");
        names.add("Animesh");
        names.add("Jeet");
        names.add("Arnav");

        Collection<String> uniqueNames = new ArrayList<String>();
        for(String s:names) {
            if(!uniqueNames.contains(s)){
                uniqueNames.add(s);
            }
        }

        System.out.println(uniqueNames);
    }

}
