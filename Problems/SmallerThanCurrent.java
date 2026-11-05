/*
How Many Numbers Are Smaller Than the Current Number? 
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
*/

class smallerThanCurrent {
    public static int[] findSmaller(int[] nums) {
        int sol[] = new int[nums.length];
        for(int i=0; i<nums.length;i++)
        {
            int cnt = 0;
            for(int j=0; j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                    cnt++;
            }
            sol[i]=cnt;
        }
        return sol;
    }
    public static void main(String[] args) {
        int arr1[] = {8, 1, 2,7};
        int arr2[] = findSmaller(arr1);
        for(int i=0; i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}

//time complexity: o(n2)