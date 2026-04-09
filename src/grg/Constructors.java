package grg;
// Constructor and their overloading
public class Constructors {
    int salary;
    String name;
    public Constructors(){
        salary=10000;
        System.out.println(salary);
    }
    public Constructors(int salary){
        System.out.println(salary);
    }
    public Constructors(int salary,String name){
        System.out.println("The salary of the "+name+" is "+salary);
    }

    public static void main(String[] args) {
        Constructors c= new Constructors();
        Constructors a= new Constructors(20000);
        Constructors b= new Constructors(30000,"Govind");
    }
}
