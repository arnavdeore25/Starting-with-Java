/*

Pattern
██  ██  ██  ██
  ██  ██  ██  
██  ██  ██  ██
  ██  ██  ██  
██  ██  ██  ██
  ██  ██  ██   
██  ██  ██  ██

*/

public class Pattern17 {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("██");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
