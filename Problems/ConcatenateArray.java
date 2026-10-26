/*
Given an integer array nums of length n, create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i]
*/

class ConcatenateArray {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ansN = 2*n;
        int[] ans = new int[ansN];
        for(int i=0; i<n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        int[] result =getConcatenation(array);

        System.out.println("Original Array:");
        for (int i : array) {
            System.out.print(i+" ");
        }

        System.out.println("\nConcatenated Array:");
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}