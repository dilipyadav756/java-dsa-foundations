package abstractionandinterface;

import java.util.Scanner;

interface Clientdetails {
    void input();
    void output();
}

class Raju implements Clientdetails {

    String name;
    double salary;

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = input.nextLine();

        System.out.println("Enter your salary:");
        salary = input.nextDouble();
    }

    @Override
    public void output() {
        System.out.println(name + " " + salary);
    }
}

public class client {

    public static void main(String[] args) {

        Raju r = new Raju();

        r.input();
        r.output();
    }
}