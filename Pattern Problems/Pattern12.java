/*

Pattern

   1
  2 3
 4 5 6
7 8 9 10

*/

public class Pattern12 {
    public static void main(String[] args) {
        int element = 1;
        for(int i=1; i<=4; i++)
            {
                System.out.print(" ".repeat(4-i));
                for(int j=1;j<=i;j++)
                {
                    System.out.print(element+" ");
                    element++;
                }
                System.out.println();
            }        
    }
}
