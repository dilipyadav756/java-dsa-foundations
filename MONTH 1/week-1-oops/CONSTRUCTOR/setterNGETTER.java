package CONSTRUCTOR;
class Programmer {

    private String name;
    private int age;


    // Getter method used to get the data
    public String getName() {
        return name; }
    int getname(){
        return age;
    }


    // Setter method is used to set or modify the data
    public void setName(String name, int age ) {
        this.age =age ;
        this.name = name;
    }
}


public class setterNGETTER {
    public static void main(String[] args) {

        Programmer p = new Programmer();
        p.setName("Geek" ,4837);
        System.out.println("Name=> " + p.getName()   +"age "  +p.getname());
    }
}
