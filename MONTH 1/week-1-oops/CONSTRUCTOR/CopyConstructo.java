package CONSTRUCTOR;
class Person12 {

    //private constructor
    private Person12(){
        System.out.println("somethis is private ");
    }
    public static void display(){
        System.out.println("hello from jhsdlf");
    }

}
public class CopyConstructo {
    public static void main(String[] args) {
        // we can not create an object for private class
        // private
        Person12.display();

    }
}
//Cannot be accessed outside its class
//outside its class means form another class
//Person is one class.
//Main is another class.
//Person() is private.
//herefore, Main cannot access the private constructor.