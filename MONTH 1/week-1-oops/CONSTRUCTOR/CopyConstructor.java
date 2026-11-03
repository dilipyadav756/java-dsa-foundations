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
}


public class CopyConstructor {
    public static void main(String[] args) {
        System.out.println("first object ");
        copy obj = new copy("fcow ", 23);
        System.out.println("name : " + obj.name + " age : " + obj.age);

        System.out.println("second object ");
        copy obj2 = new copy("skdsjbfhoiau ", 23);
        System.out.println("name : " + obj2.name + " age : " + obj2.age);
    }
}
