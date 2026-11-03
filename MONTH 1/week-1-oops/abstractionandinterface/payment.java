package abstractionandinterface;

interface paymentgateway{
    void pay();
    void refund ();
    void checkbalance();
}
class   UPI implements paymentgateway{
    public void pay(){
        System.out.println("UPI PAYMENT");
    }
    public void refund(){
        System.out.println(" REFUND DONE ");
    }
    public void checkbalance(){
        System.out.println(" CHECK BALANCE");
    }
}

public interface payment {
    public static void main(String[] args) {
        UPI u1 = new UPI();
        u1.pay();
        u1.refund();
        u1.checkbalance();
    }
}
