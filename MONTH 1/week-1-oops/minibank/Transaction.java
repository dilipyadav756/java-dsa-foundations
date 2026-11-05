package minibank;

public class Transaction {

        private double totalDeposit;
        private double totalWithdraw;

        public void addDeposit(double amount) {
            totalDeposit += amount;
        }

        public void addWithdrawal(double amount) {
            totalWithdraw += amount;
        }

        public void displayTransactionDetails() {

            System.out.println("\n------ Transaction Details ------");

            System.out.println("Total Deposit: " + totalDeposit);

            System.out.println("Total Withdrawal: " + totalWithdraw);
        }
    }

