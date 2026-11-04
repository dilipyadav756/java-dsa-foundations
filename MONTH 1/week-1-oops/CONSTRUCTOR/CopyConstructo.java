package CONSTRUCTOR;
class Student1 {

    String name;

    // Private constructor
    private Student1( String name) {
       this .name =name ;
        System.out.println("Private Constructor Called");
    }

    // Public static method
    public static void display() {

        // Creating object inside the same class
        Student1 s = new Student1("Dilip");

        System.out.println("Student Name: " + s.name);
    }
}

public class CopyConstructo {

    public static void main(String[] args) {

        // Calling static method using class name
        Student1.display();

        // Student s = new Student(); // ERROR
    }
}