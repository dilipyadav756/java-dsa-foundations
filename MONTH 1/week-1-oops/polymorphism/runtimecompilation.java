package polymorphism;
class animal{
    void sound(){
        System.out.println("animal sounds ");
    }
    void eat(){
        System.out.println("eating");
    }

}
class dog extends animal{
    void sound(){
        System.out.println("dog is barking ");
    }
    void eat(){
        System.out.println("dog is eat");
    }
}

class tiger extends animal{
    void sound(){
        System.out.println("roaring ");
    }
    void eat(){
        System.out.println(" eating meat ");
    }
}


public class runtimecompilation {
    public static void main(String[] args) {
        animal a = new animal();
        animal b = new dog();
        animal c = new tiger();
        a.sound();
        a.eat();
        b.sound();
        b.eat();
        c.sound();
        c.eat();

    }

}
