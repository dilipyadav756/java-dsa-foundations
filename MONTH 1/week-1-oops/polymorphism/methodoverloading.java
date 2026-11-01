package polymorphism;
class addition {
    void add(int a, int b) {
       int  sum = a + b;
        System.out.println(sum);
    }
    void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }
}


public class methodoverloading {
    public static void main(String[] args) {
        addition a = new addition();

        a.add(10, 20);
        a.add(10, 20 ,30);


    }
}
