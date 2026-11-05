/*

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn]

*/

public class ShuffleArray 
{
    public static int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < n; i++) {
            newArray[2 * i] = nums[i];
            newArray[2 * i + 1] = nums[i + n];
        }
        return newArray;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        
        int[] result = shuffle(nums, n);
        for(int i=0; i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
