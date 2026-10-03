import java.util.*;

public class bubbleSort {
    public static void main(String a[]) {
        int n, temp;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of values in array: ");
        n = sc.nextInt();
        System.out.println("Enter "+n+" Values:");
        for(int i=0 ; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array:\n");
        for(int i=0 ; i<n; i++) {
            System.out.println(arr[i]);
        }

        for(int i = 0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:\n");
        for(int i=0 ; i<n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}