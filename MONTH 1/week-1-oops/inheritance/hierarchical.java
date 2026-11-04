package inheritance;
// EMPLOYEE MANAGEMENT SYSTEM

class EMPLOYEE{
    int salary;
    String name;
void displayDetails(){
    System.out.println("Employee Name: "+name);
    System.out.println("Employee Salary: "+salary);
}
}
class developer  extends EMPLOYEE{
    String programming   ;
    void writecode(String programming ){
        this .programming =programming;
        System.out.println("Developer Programming "+programming);
    }
}

class manager  extends EMPLOYEE {
    int teamsize;

    void manageteam(int teamsize) {
        this.teamsize = teamsize;
        System.out.println("Manager team " + teamsize);
    }
}


public class hierarchical {
    public static void main(String[] args) {

         developer d = new developer();
         d.name="Sohan";
         d.salary=1000;
         d.displayDetails();

       manager m = new manager();
       m.name ="Mike";
       m.salary=10900;
        m.displayDetails();
       d.writecode("java  ");
       m.manageteam(5);


    }
}
