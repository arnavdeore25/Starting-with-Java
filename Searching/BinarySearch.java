/**
 * BinarySearch
 */
public class BinarySearch {
    static int search(int[] a, int searchKey) {
        int low = 0;
        int high = a.length-1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if (a[mid]==searchKey)
                return mid;
            if (a[mid] < searchKey)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 1,3,4,5,6,7,8,10};
        int sk = 4;
        int index = search(a, sk);

        if (index == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element present at index: "+index);
    }
}