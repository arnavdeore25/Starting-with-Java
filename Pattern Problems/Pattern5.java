/*

Question

*
**
***
****
*****
****
***
**
*


*/

import java.util.*;;
public class Pattern5 {
    public static void main(String[] args) {
//Brute Force
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//Single Outer Loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int col = 1;
        for(int i=1; i<=2*n-1; i++)
        {
            for(int j=1; j<=col; j++)
            {
                System.out.print("* ");
            }
            if(i<n){
                col++;
            }
            else{
                col--;
            }
            System.out.println();

        }
        sc.close();
    }
}