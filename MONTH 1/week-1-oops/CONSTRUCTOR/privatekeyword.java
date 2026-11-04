package CONSTRUCTOR;

import java.sql.SQLOutput;

class student1{
    String name ;
   private int age;
    double cgpa;
     void print(){
        System.out.print(name+" \n"+cgpa+" \n" +age );
    }
    int  getage(){// GETTER METHOD

        return age;
    }
void setrolno(int x){
         age=x;
}

}

public class privatekeyword {
    public static void main(String[] args) {
        student1 obj = new student1();
        obj.cgpa = 4.5;
//        obj.age = 18;  not acces directly bcz it is  a private
        obj.name ="mohan ";
        obj.print();
        obj.setrolno(5);
        // here its return name and cgpa value and for age it retun default vlaue
        System.out.println(obj.getage());
    }
}
