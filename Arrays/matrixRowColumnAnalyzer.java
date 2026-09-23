/* 
Given a 2D integer matrix, find:

Sum of each row
Sum of each column
Row with the maximum sum
Column with the maximum sum
*/

import java.util.*;

class matrixRowColumnAnalyzer 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int r, c;
        int sum;
        int maxSum = 0;
        int index = 0;
        System.out.println("Enter total rows");
        r = sc.nextInt();     
        System.out.println("Enter total columns");
        c = sc.nextInt();
        int multiArray[][] = new int[r][c];
        for(int i=0; i<r;i++)
        {
            for(int j =0 ;j<c;j++) 
            {
                System.out.println("Enter Value for ( "+i+","+j+" )");
                multiArray[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<r;i++)
        {
            for(int j =0 ;j<c;j++) 
            {
                System.out.print(multiArray[i][j]);
            }
            System.out.println();   

        }



        for(int i=0; i<r;i++)
        {
            sum=0;
            for(int j =0 ;j<c;j++) 
            {
                sum += multiArray[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" is "+ sum);
            System.out.println();
            if(sum>maxSum)
            {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println("Row with the maximum sum: " + index);
        maxSum=0;
        for(int i=0; i<c;i++)
        {
            sum=0;
            for(int j =0 ;j<r;j++) 
            {
                sum += multiArray[j][i];
            }
            System.out.println("Sum of column "+(i+1)+" is "+ sum);
            System.out.println();
            if(sum>maxSum)
            {
                maxSum = sum;
                index=i;
            }
        }
            System.out.println("Row with the maximum sum: " + index);


        sc.close();
     }
    
}