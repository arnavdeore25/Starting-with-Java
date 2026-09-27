package Encapsulation;

class AccountDetails
{
    private int accountNumber;
    private String accountHolder;
    private int accountBalance;
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    
}

public class BankAccount {
    public static void main(String[] args) {
        AccountDetails acc1 = new AccountDetails();
        acc1.setAccountNumber(10001);
        acc1.setAccountHolder("Arnav");
        acc1.setAccountBalance(50000);
        System.out.println("=============BANK ACCOUNT DETAILS=============");
        System.out.println(acc1.getAccountNumber());
        System.out.println(acc1.getAccountHolder());
        System.out.println(acc1.getAccountBalance());
    }
}
