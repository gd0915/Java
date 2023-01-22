package miniatmproject;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Laura Braun", 2000);

        bankAccount.withdraw(500);
        bankAccount.deposit(4000);
        bankAccount.withdraw(1000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
    }
}
