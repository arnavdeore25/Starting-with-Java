package Abstraction;
interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

public class InterfacePayment {
    public static void main(String[] args) {

        Payment payment1 = new UPIPayment();
        payment1.pay(1500);

        Payment payment2 = new CardPayment();
        payment2.pay(2500);
    }
}