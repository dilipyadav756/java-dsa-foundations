
package CONSTRUCTOR;

class BankAccount {

    private String name;
    private long accountnumber;
    private double balance;

    // Getter methods

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountnumber;
    }

    // Setter methods

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }
}

public class bankdatagetandset {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.setName("Shyam");
        b1.setBalance(58);
        b1.setAccountNumber(938459876);

        System.out.println(b1.getName());
        System.out.println(b1.getBalance());
        System.out.println(b1.getAccountNumber());
    }
}
