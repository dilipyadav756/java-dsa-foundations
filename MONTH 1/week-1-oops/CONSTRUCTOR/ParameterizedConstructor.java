package CONSTRUCTOR;
class parameterized{
    String name;
    int age;
    //parameterised constructor
    parameterized(String name, int age){
        this.name = name;
        this.age = age;
    }
    //method to display
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


public class ParameterizedConstructor {
    public static void main(String[] args) {
        parameterized  p = new parameterized("John", 18);
        p.display();
    }
}
