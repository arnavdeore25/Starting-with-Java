import java.util.Scanner;

public class arrayRotation 
{
    static void rotateArray(int[] arr, int k) 
    {
        int n = arr.length;
        k = k%n;

        for (int i = 0; i<k;i++) 
        {

            int last = arr[n - 1];
            for (int j = n -1; j > 0; j--) 
            {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }

    static void displayArray(int[] arr) 
    {
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i=0; i<n; i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        rotateArray(arr, k);
        System.out.println("Rotated Array:");
        displayArray(arr);
        sc.close();
    }
}