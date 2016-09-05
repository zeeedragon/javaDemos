package bank;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    private double minBalanace;

    public SavingsAccount(double interest) {
        super();
        setAccountType("Savings Account");
        this.interestRate = interest;
        this.minBalanace = getBalance();
    }

    public SavingsAccount(double interest, double balance) {
        super();
        setAccountType("Savings Account");
        this.interestRate = interest;
        setBalance(balance);
        minBalanace = getBalance();
    }

    //getters
    public double getInterestRate() {
        return interestRate;
    }

    public double getMinBalanace() {
        return minBalanace;
    }

    //setter only applicable for interestRate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void withdraw(double amt) {
        double remainder = getBalance();
        if (remainder < amt) {
            System.out.println("Insufficient funds.Transactions is invalid");
        } else if (remainder > amt) {
            super.withdraw(amt);
            minBalanace = remainder;
        }
    }

    public void monthEnd() {
        double sum = minBalanace * interestRate / 100;
        super.deposit(sum);
        minBalanace = getBalance();
    }
}
