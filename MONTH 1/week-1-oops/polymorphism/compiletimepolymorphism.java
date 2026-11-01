package polymorphism;
// method overloading = is a type of polymorphism where the method call is resolved by
// by compiler during compilation
// it is achieved by method overloading = its allow multiple method to have same name but different parameter
// multiple method in the same classs
class multiply{
    void multi(int a,int b){
        System.out.println(a*b);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);
    }

}

public class compiletimepolymorphism {
    public static void main(String[] args) {
        multiply m = new multiply();
        m.multi(10,20);
        m.sub(10,20);
        m.add(1,20);
    }
}
