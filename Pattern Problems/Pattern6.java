/*

Pattern: 
      *
     * *
    * * *
   * * * *
  * * * * *
   * * * *
    * * *
     * *
      *

*/


import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        
        int col = 1;
        for(int i=1; i<=2*n-1; i++)
        {
            int space = n-col;
            for(int k=0; k<space; k++) { System.out.print(" "); }
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
            sc.close();
        }
    }
}
