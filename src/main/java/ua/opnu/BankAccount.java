package ua.opnu;

public class BankAccount {
    public double balance;
    public double transactionFee;

    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        double total = amount + transactionFee;
        if (total > balance) return false;

        balance -= total;
        return true;
    }

    public boolean transfer(BankAccount other, double amount) {
        if (other == null || amount <= 0) return false;
        if (!withdraw(amount)) return false;
        other.deposit(amount);
        return true;
    }
}
