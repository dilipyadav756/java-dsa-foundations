package CONSTRUCTOR;
final class Student2 {//A final class cannot be inherited.
   final String name = "Johny";//In simple words: final means you cannot change or override certain things, depending on where it is used.

final void display() {
    System.out.println(name);

}
//class c2 extends student2{
//    this is not possible
//}
//class s1 extends Student2 {
//    void display(){
//        this is not possible
  //  A final method cannot be overridden by a subclass.
    }


public class finalvariable {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.display();
    }
}
