package inheritance;
class vechile  {
vechile (){
    System.out.println("vechile constructor");
}
}
class FourWeeler extends vechile {
FourWeeler (){
    System.out.println("FourWeeler constructor");
}
}
class car extends FourWeeler {
    car (){
    System.out.println("car constructor");
    }
}

public class multiLevel {
    public static void main(String[] args) {
        car c = new car();
    }
}
