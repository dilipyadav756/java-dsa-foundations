package minibank;

public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    private Transaction transaction;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transaction = new Transaction();
    }

    // Deposit method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            transaction.addDeposit(amount);

            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method overloading
    public void deposit(int amount) {
        deposit((double) amount);
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transaction.addWithdrawal(amount);

            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayAccountDetails() {

        System.out.println("\n------ Account Details ------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }

    // Display transactions
    public void displayTransactionDetails() {
        transaction.displayTransactionDetails();
    }
}