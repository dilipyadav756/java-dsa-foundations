package CONSTRUCTOR;
class copy{
    String name;
    int age;

    //parameter constructor
    copy(String name, int age){
        this.name = name;
        this.age = age;
    }
    // copy constructor
    copy(copy obj2 ){
        this.name = obj2.name;
        this.age = obj2.age;
    }
    void display(){
        System.out.println("name is " + name);
        System.out.println("age is " + age);
    }
}


public class CopyConstructor {
    public static void main(String[] args) {
//        copy obj = new copy("John", 18);
        System.out.println("first object ");
        copy obj = new copy("cow ", 23);
       obj.display();

        System.out.println("second object ");
        copy obj2 = new copy(obj);
       obj2.display();
    }
}
