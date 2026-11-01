/*

Pattern: 

****
 ****
  ****
   ****
    ****

*/

public class Pattern9 {
    public static void main(String[] args) {
        int space = 0;
        for(int i=1; i<=10; i++)
        {
            if(i>1)
            {
                space++;
            }
            System.out.print(" ".repeat(space));
            for(int j=1; j<=10; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
