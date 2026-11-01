package polymorphism;

class Salary {

    void calculateSalary() {
        System.out.println("Salary calculation of employee");
    }

    static class Manager extends Salary {

        void calculateSalary() {
            System.out.println("Manager salary is 8909889");
        }
    }

    static class Employee extends Salary {

        void calculateSalary() {
            System.out.println("Employee salary is 89889");
        }
    }
}

public class EmployeeSalery {

    public static void main(String[] args) {

       Salary s1 =new Salary();
      Salary m1 =new Salary.Manager();
      Salary.Employee e1 =new Salary.Employee();
      s1.calculateSalary();
      m1.calculateSalary();
      e1.calculateSalary();
    }
}