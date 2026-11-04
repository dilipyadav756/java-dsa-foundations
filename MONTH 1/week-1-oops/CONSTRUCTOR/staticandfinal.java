package CONSTRUCTOR;
class cricketer{
   static String name = "nz";
    int runs ;
    void print(int runs ){
        System.out.println("name is "+name +" "+"runs is "+runs);
    }
    static void  greed (){
        System.out.println("name is greed");
    }

}


public class staticandfinal {
    public static void main(String[] args) {
        cricketer cr = new cricketer();
cr.name = "nzsdsd";
        cricketer c2 = new cricketer();
        cr.greed();
        c2.print(39);
        cr.print(8);
        cr.greed();
        c2.greed();
    }
}
