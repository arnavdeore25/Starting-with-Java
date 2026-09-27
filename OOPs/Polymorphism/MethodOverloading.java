package Polymorphism;

class Calculator {

    int calculate(int a,int b) {
        return a + b;
    }

    int calculate(int a,int b,int c) {
        return a+b+c;
    }

    double calculate(double a, double b) {
        return a *b;
    }
}

public class MethodOverloading {
        public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Adding of 2 numbers: "+calc.calculate(10,20));
        System.out.println("Adding of 3 numbers: "+calc.calculate(10, 20, 30));
        System.out.println("Multiplication: "+calc.calculate(5.5, 2.0));
    }
}
