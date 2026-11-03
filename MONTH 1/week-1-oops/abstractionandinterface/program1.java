package abstractionandinterface;
//A vehicle is a simple real-life example of abstraction. Different types of vehicles can start in different ways, but the common operation can be defined without exposing its implementation details.
abstract class vechile{
    abstract void start();
}
class bick extends vechile{
    void start(){
        System.out.println("Bick start with kick and self");
    }
}
class car extends vechile{
    void start(){
        System.out.println("Car start with self");
    }
}
class bus extends vechile{
    void start(){
        System.out.println("Car start with key");
    }
}


public class program1 {
    public static void main(String[] args) {
        vechile b =new bick();
        vechile c =new car();
        vechile bus = new bus();
        b.start();
        c.start();
        bus.start();
    }

}
