package bank;


public class CheckingAccWithCredit extends CheckingAccount {
    private double creditAmount;

    //constructors
    public CheckingAccWithCredit(double creditAmount) {
        super();
        this.creditAmount = creditAmount;
    }

    public CheckingAccWithCredit(double initBal, double creditAmount) {
        super(initBal);
        this.creditAmount = creditAmount;
    }

    //getter
    public double getCreditAmount() {
        return creditAmount;
    }
    //setter does not apply
    //public void setCreditAmount(double creditAmount) {
    //    this.creditAmount = creditAmount;
    //}

    public void withdrawWithCredit(double amt) {
        super.setBalance(this.getBalance() + this.creditAmount);
        if (super.getBalance() > amt) {
            super.withdraw(amt);
        } else {
            System.out.println("you have exceeded your credit by " + (amt - super.getBalance()));
            super.withdraw(amt);
        }
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("This is overriding the print of the ancestor class");
        System.out.printf("%d - %s, %.2f", super.getAccountNum(), super.getAccountType(), super.getBalance());
        System.out.println();
        System.out.println("And here is the allowed credit: " + this.creditAmount);
        System.out.println();
    }
}
