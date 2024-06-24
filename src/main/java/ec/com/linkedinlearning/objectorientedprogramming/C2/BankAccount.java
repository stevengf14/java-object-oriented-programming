package ec.com.linkedinlearning.objectorientedprogramming.C2;

/**
 *
 * @author steve
 */
public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
