import java.util.Scanner;

public class missingNumber 
{
    static int findMissingNumber(int[] arr) 
    {
        int n = arr.length;
        int expectedSum = (n+1)*(n+2)/2;
        int actualSum =0;
        for (int num:arr) 
        {
            actualSum += num;
        }
        return expectedSum- actualSum;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing Number: " + findMissingNumber(arr));
        sc.close();
    }
}