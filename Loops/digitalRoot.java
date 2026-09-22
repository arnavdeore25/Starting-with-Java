public class digitalRoot {
    public static void main(String[] args) {
        int num=5723;
        while (num >= 10) 
        {
            int sum = 0;
            while (num > 0) 
            {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
            
        }
        System.out.println("Digital Root: "+num);
    }
}
