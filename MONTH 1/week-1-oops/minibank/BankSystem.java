package minibank;


import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount account = null;

        int choice;

        do {

            System.out.println("\n========== MINI BANK SYSTEM ==========");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Display Account Details");
            System.out.println("7. Display Transactions");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (account != null) {
                        System.out.println("Account already exists!");
                        break;
                    }

                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    if (balance < 0) {
                        System.out.println("Invalid initial balance!");
                        break;
                    }

                    account = new SavingsAccount(accNo, name, balance);

                    System.out.println("Account created successfully!");

                    break;

                case 2:

                    if (account == null) {
                        System.out.println("Create an account first!");
                        break;
                    }

                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    account.deposit(deposit);

                    break;

                case 3:

                    if (account == null) {
                        System.out.println("Create an account first!");
                        break;
                    }

                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    account.withdraw(withdraw);

                    break;

                case 4:

                    if (account == null) {
                        System.out.println("Create an account first!");
                        break;
                    }

                    System.out.println("Current Balance: " + account.getBalance());

                    break;

                case 5:

                    if (account == null) {
                        System.out.println("Create an account first!");
                        break;
                    }

                    account.calculateInterest();

                    break;

                case 6:

                    if (account == null) {
                        System.out.println("Create an account first!");
                        break;
                    }

                    account.displayAccountDetails();

                    break;

                case 7:

                    if (account == null) {
                        System.out.println("Create an account first!");
                        break;
                    }

                    account.displayTransactionDetails();

                    break;

                case 8:

                    System.out.println("Thank you for using Mini Bank System!");

                    break;

                default:

                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}