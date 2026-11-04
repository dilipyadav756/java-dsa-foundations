package CONSTRUCTOR;
class Student34 {

    String name;
    int age;

    Student34(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class thiskey {

    public static void main(String[] args) {

        Student34 s1 = new Student34("Dilip", 20);

        s1.display();
    }
}


