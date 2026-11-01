package polymorphism;

import org.w3c.dom.ls.LSOutput;
class additions {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("sum of two additions is " + sum);
    }
    void floatAddition(float a, float b) {
        float sum  = a + b;
        System.out.println("sum of two float additions is " + sum);
    }
    void doubleAddition(double a, double b) {
        double sum  = a + b;
        System.out.println("sum  of two double additions is " + sum);
    }
}
public class differentdatatypeadd {
    public static void main(String[] args) {
        additions a = new additions();
        a.floatAddition(10.5f, (float) 206.8f);
        a.doubleAddition(10.98,20.98);
        a.add(10, 20);
    }
}
