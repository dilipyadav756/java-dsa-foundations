package inheritance;
interface A{
     void show();

}
interface b{
    void show2();
    }

class Inheritance implements A, b{
    @Override
    public void show() {
        System.out.println("Hello World");
    }
    public void show2() {
        System.out.println("Hello World");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Inheritance m = new Inheritance();
        m.show();
        m.show2();
    }
}
