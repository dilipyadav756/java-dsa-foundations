package polymorphism;
class bank{
    void getinterestrate(){
        System.out.println("Interest rate");
    }
}
class SBI extends bank{
    void getinterestrate(){
        System.out.println("sbi Interest rate = 7%");
    }
}
class HDFC extends bank{
    void getinterestrate(){
        System.out.println("HDFC Interest rate: 8%");
    }
}
class icici extends bank{
    void getinterestrate(){
        System.out.println("ICICI Interest rate: 9%");
    }
}

public class BankInterest {
    public static void main(String[] args) {
        bank b1 = new bank();
        b1.getinterestrate();
        SBI s1 = new SBI();
        s1.getinterestrate();
        HDFC h1 = new HDFC();
        h1.getinterestrate();
        icici ici = new icici();
        ici.getinterestrate();

    }
}
