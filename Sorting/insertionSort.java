import java.util.*;

public class insertionSort {
    public static void main(String a[]) {
        int n, sortedElement, j;
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

        for(int i = 0; i<n; i++) {
            sortedElement = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>sortedElement) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=sortedElement;
        }

        System.out.println("Sorted Array:\n");
        for(int i=0 ; i<n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}