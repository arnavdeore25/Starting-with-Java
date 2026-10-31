/**
 * LinearSearch
 */
public class LinearSearch {
    static int search(int[] a, int searchKey) 
    {
        for (int i=0; i<a.length; i++) 
        {
            if (a[i] == searchKey)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        int[] a = {1,3,4,5,6,7,8,10 };
        int sk=4;
        int index = search(a, sk);

        if (index==-1)
            System.out.println("Element not present");
        else
            System.out.println("Element present at position: "+index);
    }
}

// time complexity: O(n)