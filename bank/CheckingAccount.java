package bank;

public class CheckingAccount extends BankAccount {
    //fields
    private int countWithdrawals;

    //constructors
    public CheckingAccount() {
        super();
        setAccountType("Checking Account");
        this.countWithdrawals = 0;
    }

    public CheckingAccount(double initBal) {
        super();
        setAccountType("Checking Account");
        setBalance(initBal);
        this.countWithdrawals = 0;
    }

    //getters; no setters apply
    public int getCountWithdrawals() {
        return countWithdrawals;
    }

    public void withdraw(double amt) {
        final int COUNT_FREE = 3; //free withdrawals
        final double TAX = 1; //cost of withdrawal
        super.withdraw(amt);
        countWithdrawals++;
        if (countWithdrawals > COUNT_FREE) {
            super.withdraw(TAX);
        }
    }

    public void monthEnd() {
        countWithdrawals = 0;
    }
}
