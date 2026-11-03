package CONSTRUCTOR;
class asbd{
    String name ; //instance variable
    int age ;
}
//public → JVM can access it.
//static →
//void → Does not return any value.
//main → Entry point of the Java program.
//- String[] args → Receives command-line arguments.
public class defaultcons {
    public static void main(String[] args) {
        asbd a = new asbd();
        System.out.println("Name : " + a.name);
        System.out.println("Age : " + a.age);
    }
}//Java initializes its instance variables with default values.
//. → Accesses a member of the object.