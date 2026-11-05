package minibank;

 class SavingsAccount extends BankAccount {

    private double interestRate = 5.0;

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {

        super(accountNumber, accountHolder, balance);
    }

    // Calculate interest
    public void calculateInterest() {

        double interestAmount = (getBalance() * interestRate) / 100;

        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Amount: " + interestAmount);
    }

    // Method overriding
    @Override
    public void displayAccountDetails() {

        System.out.println("\n------ Savings Account ------");
        super.displayAccountDetails();
    }
}