package bank;

public class BankAccount {
    private int accountNum;
    private String accountType;
    private double balance;
    private static int nextNum = 100000;

    public BankAccount() {
        this.accountNum = nextNum;
        this.accountType = "";
        this.balance = 10;
        nextNum++;
    }

    //constructor with initial balance
    public BankAccount(double initBal) {
        this.accountNum = nextNum;
        this.accountType = "";
        setBalance(initBal);
        nextNum++;
    }

    //getters
    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public static int getNextNum() {
        return nextNum;
    }

    //setters
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void monthEnd() {
        //to be updated
    }

    public void print(){
        System.out.printf("%d - %s, %.2f", accountNum, accountType, balance);
        System.out.println();
    }
}
