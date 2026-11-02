/*

Pattern

****
***
**
*
**
***
****

*/


public class Pattern10 {
    public static void main(String[] args) {
        for(int i = 1; i<=7; i++)
        {
            if(i<=4)
            {
                for(int j = 4; j>=i ; j--)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j=2; j<=i-2; j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
     
}