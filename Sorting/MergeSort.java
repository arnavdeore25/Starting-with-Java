public class MergeSort {

    private static void merge(int[] arr, int low, int median, int high)
    {
        int sizeLeft = median - low + 1;
        int sizeRight = high - median;
        int[] leftArr = new int[sizeLeft];
        int[] rightArr = new int[sizeRight];

        for (int i = 0; i < sizeLeft; i++) {
            leftArr[i] = arr[low + i];
        }

        for (int j = 0; j < sizeRight; j++) {
            rightArr[j] = arr[median + 1 + j];
        }

        int i = 0, j = 0, k = low;

        while (i < sizeLeft && j < sizeRight) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < sizeLeft) {
            arr[k++] = leftArr[i++];
        }

        while (j < sizeRight) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void mergeSort(int[] arr, int low, int high)
    {
        if(low < high) 
        {
            int median = (low + high) / 2;
            mergeSort(arr, low, median);
            mergeSort(arr, median + 1, high);
            merge(arr, low, median, high);
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {3, 5, 1, 4, 6, 2};
        System.out.print("Before Sorting:");
        for(int n : arr) {
            System.out.print(" " + n);
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println();
        System.out.print("After Sorting:");
        for(int n : arr) {
            System.out.print(" " + n);
        }
    }
}
