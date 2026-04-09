package grg;

class Employee {
    int id;
    String name;
    public void details(){
        System.out.println("Employee id is "+id);
        System.out.println("Employee name is "+name);
    }
 public static class Oop{
     public static void main(String[] args) {
         Employee GOVI=new Employee();
         Employee Sarth=new Employee();

         GOVI.id= 3;
         GOVI.name="Govind";
         Sarth.id= 4;
         Sarth.name="Sarthak";
         GOVI.details();
         Sarth.details();
     }
 }
}
