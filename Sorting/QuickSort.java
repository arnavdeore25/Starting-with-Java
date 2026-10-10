public class QuickSort
{

    private static int partition(int[] arr, int low, int high)
    {
        int pi = arr[high];
        int i = low - 1;
        for ( int j = low; j<high; j++)
        {
            if(arr[j]<pi) 
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            int pivotValue = partition(arr, low, high);
            quickSort(arr, low, pivotValue-1);
            quickSort(arr, pivotValue+1 , high);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {50, 40, 30, 20, 100};
        quickSort(arr, 0, arr.length-1);
        for(int i:arr) 
        {
            System.out.print(i+" ");
        }
    }
}