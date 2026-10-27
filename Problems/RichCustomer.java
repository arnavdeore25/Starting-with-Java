/*

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

*/

class RichCustomer {
    public static int solution(int[][] accounts) {
        int[] sum = new int[accounts.length];
        for(int i=0; i<accounts.length; i++)
        {
            int totalSum = 0;
            for(int j=0; j<accounts[i].length; j++)
            {
                totalSum += accounts[i][j];
            }
            sum[i] = totalSum;
        }
        int max = sum[0];
        for(int i=0; i<sum.length; i++)
        {
            if(sum[i]>max)
                max = sum[i];
        }
        return max;
    }
    public static int optimizedSolution(int[][] accounts) {
        int max = accounts[0][0];
        for(int i=0; i<accounts.length; i++)
        {
            int totalSum = 0;
            for(int j=0; j<accounts[i].length; j++)
            {
                totalSum += accounts[i][j];
            }
            if(totalSum>max)
                max = totalSum;
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[][] accounts = {{1, 2,1,1, 4}, {1,2,3,4,5}, {3,2, 4, 0, 0},{1,2,1,4, 5}};

        int result = solution(accounts);
        System.out.println("Richest customer's wealth: "+result);
        int result2 = optimizedSolution(accounts);
        System.out.println("Richest customer's wealth (optimized solution): "+result2);
    }
}