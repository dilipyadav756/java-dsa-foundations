package polymorphism;
//consider a person who plays different roles in life, like a father,
// a husband, and an employee.
// Each of these roles defines different behaviors of the person
// depending on the object calling it.

class person{
     void display(){
         System.out.println(" person");
     }

}

class father extends person{
     void display(){
         System.out.println("display father");
     }
}
class mother extends person{
     void display(){
         System.out.println("display mother");
     }
}


public class polymorphism2 {
     public static void main(String[] args) {
         person p1 =new person();
         p1.display();
         father f1 =new father();
         f1.display();
         mother mother =new mother();
         mother.display();
     }
}
