/* Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
*/


class RunningSum {
    public static int[] solution(int[] no)
    {
        int[] newArr = new int[no.length];
        for(int i=0; i<no.length; i++)
        {
            int sum=0;
            for(int j=0; j<=i; j++) 
            {
                sum += no[j];
            }
            newArr[i] = sum;
        }
        return newArr;
    } 

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1,1};
        int[] runningSumArray = solution(numbers);
        System.out.println("Normal Array:");
        for(int i: numbers) {
            System.out.print(" "+i);
        }
        System.out.println("\nRunning Sum Array:");
        for(int i: runningSumArray) {
            System.out.print(" "+i);
        }
    }
}
