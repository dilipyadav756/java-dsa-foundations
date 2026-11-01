package polymorphism;
class shape {
   public void draw(){
        System.out.println("DRAWING");
    }
    public void erase(){
        System.out.println("ERASING");
    }
}
class circle extends shape{
    public void draw(){
        System.out.println("DRAWING  circle");
    }
    public void erase(){
        System.out.println("ERASING circle");

    }
}
class triangle extends shape {
    public void draw(){
        System.out.println("DRAWING triangle");
    }
    public void erase(){
        System.out.println("ERASING triangle");
    }
}




public class program1 {
    public static void main(String[] args) {
        shape s = new shape ();
         s.draw();
         s.erase();
         shape s1 = new circle ();
         s1.draw();
         s1.erase();
         shape s2 = new triangle();
         s2.draw();
         s2.erase();

    }
}
