public class SwapVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;
        System.out.println("A = "+a+"\nB = "+b);
    }
}
