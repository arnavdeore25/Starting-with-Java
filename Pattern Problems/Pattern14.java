/*

        *
      * *
    * * *
  * * * *
* * * * *

*/


public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        int space;
        for(int i=1; i<=n; i++)
        {
            space = n-i;
            System.out.print("  ".repeat(space));
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}
