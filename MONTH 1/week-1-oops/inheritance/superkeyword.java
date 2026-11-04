package inheritance;
class a{
    int p=10;
//    System.out.println("confusing ");
    void demo(){
        System.out.println("confusing ");
    }
    a(){
        System.out.println("hii gm ");
    }
   void gr(){
        System.out.println("hii pppp ");
    }

}
class bu extends a{
     int p=20;
    void start() {
        System.out.println("value of p" +p);
        System.out.println("value of p"+ super.p);
        super.demo();

    }
}
public class superkeyword {
    public static void main(String[] args) {
        bu object = new bu();
        object.start();
        object.gr();
        object.demo();
    }
}
