package CONSTRUCTOR;

class student {

    // constructor with one argument
    student (String name){

        System.out.println("Constructor with one "
                + "argument - String: " + name);
    }

    // constructor with two arguments
  student (String name, int age){

        System.out.println(
                "Constructor with two arguments: "
                        + " String and Integer: " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous
student (long id)
    {
        System.out.println("Constructor with one argument: " + "Long: " + id);
    }
}


public class ConstructorOverloading {
    public static void main(String[] args) {
        student s1 = new student("John");
        student s2 = new student("John", 18);
        student s3 =new student (34876);


    }
}
