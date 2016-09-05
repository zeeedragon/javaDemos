package bank;

public class Main {
    public static void main(String[] args) {

        //BankAccount parent instances
        BankAccount regularDefault = new BankAccount();
        BankAccount regularInit = new BankAccount(100);
        regularDefault.print();
        regularInit.print();
        System.out.println();

        //withdrawal demo
        System.out.println("Balance before withdrawal: " + regularDefault.getBalance());
        regularDefault.withdraw(2);
        System.out.println("Balance after withdrawal: " + regularDefault.getBalance());
        System.out.println();

        //deposit demo
        System.out.println("Balance before deposit: " + regularInit.getBalance());
        regularInit.deposit(23);
        System.out.println("Balance after deposit: " + regularInit.getBalance());
        System.out.println();

        //Checking Account instances and their methods
        CheckingAccount checkAccDefault = new CheckingAccount();
        CheckingAccount checkAccInit = new CheckingAccount(15);
        checkAccDefault.print();
        checkAccInit.print();
        checkAccDefault.monthEnd();
        System.out.println();

        //setting a new balance
        checkAccDefault.setBalance(200);
        System.out.println("Balance after setting new balance: " + checkAccDefault.getBalance());
        System.out.println("Getting the count of withdrawals after executing the monthEnd() method: " + checkAccDefault.getCountWithdrawals());
        checkAccDefault.print();
        System.out.println();

        //Savings Account instances
        SavingsAccount saveAccDefault = new SavingsAccount(1.5);
        SavingsAccount saveAccInit = new SavingsAccount(1.7, 20);
        saveAccDefault.print();
        saveAccInit.print();
        System.out.println();

        //demonstrating exceeded funds behaviour of the savings account
        saveAccDefault.withdraw(11);
        System.out.println("Savings account after withdrawal: " + saveAccDefault.getBalance());
        saveAccDefault.monthEnd();
        System.out.println("Savings account after monthEnd()" + saveAccDefault.getMinBalanace());
        System.out.println();

        //initializing an instance of the parent with the child type
        BankAccount bA1 = new CheckingAccount();
        BankAccount bA2 = new SavingsAccount(3.2, 3);
        bA1.print();
        bA2.print();
        bA1.monthEnd();
        System.out.println();

        //Savings Account with credit instances
        CheckingAccWithCredit accWithCredit = new CheckingAccWithCredit(100, 20);
        accWithCredit.print();
        CheckingAccount checkingAcc = new CheckingAccWithCredit(300, 400);
        System.out.println("Savings account with credit initially has " + accWithCredit.getBalance() + " balance and"  + accWithCredit.getCreditAmount() + " allowed credit");
        //demo of withdraw with credit
        accWithCredit.withdrawWithCredit(130);
        System.out.println("Savings account with credit allows negative balance " + accWithCredit.getBalance());
        System.out.println("And here is to validate that thus instantiated CheckingAccWithCredit object also has access to its ancestor fields - countWithdrawals: " + checkingAcc.getCountWithdrawals());
    }
}
