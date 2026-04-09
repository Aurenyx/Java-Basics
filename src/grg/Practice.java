package grg;
    //public class Employee {
//    int salary;
//    String name;
//    int getsalary() {
//        return salary;
//    }
//    String getname() {
//        return name;
//    }
//    void setname(String n) {
//        name = n;
//    }
//    public static void main(String[] args) {
//        Employee p= new Employee();
//        p.setname("Govind");
//        p.salary= 20000;
//        System.out.println("The name of the employee is "+p.getname());
//        System.out.println("The Salary of the employee is "+p.getsalary());
//    }
//}


//    class Cellphone{
//        void ring() {
//            System.out.println("ringing..");
//        }
//        void vibrate() {
//            System.out.println("vibrating..");
//        }
//            public static void main(String[] args) {
//                Cellphone c = new Cellphone();
//                c.ring();
//                c.vibrate();
//            }
//        }

//public class Square {
//   int side;
//    void Area(){
//        System.out.println("Area of Square is "+side*side);
//    }
//    void Perimeter(){
//        System.out.println("The perimeter of the Square is "+4*side);
//    }
//
//    public static void main(String[] args) {
//        Square P=new Square();
//        P.side=6;
//        P.Area();
//        P.Perimeter();
//    }
//}

//public class Rectangle {
//    int len,breadth;
//    public int area(){
//        return len*breadth;
//    }
//    public int perimeter(){
//        return 2*(len+breadth);
//    }
//
//    public static void main(String[] args) {
//        Rectangle S=new Rectangle();
//        S.len=3;
//        S.breadth=4;
//        System.out.println("The area of the Rectangle is "+S.area());
//        System.out.println("The Perimeter of the Rectangle is "+S.perimeter());
//    }
//}

//public class Tommy {
//    void hit() {
//        System.out.println("Hitting the enemy");
//    }
//
//    void run() {
//        System.out.println("Running towards the enemy");
//    }
//
//    void fire() {
//        System.out.println("Firing on the enemy");
//    }
//
//    public static void main(String[] args) {
//        Tommy R = new Tommy();
//        R.fire();
//        R.hit();
//        R.run();
//    }
//}

public class Practice {
    int radius;
    void Area(){
        System.out.println("The Area of Circle is "+(3.14f)*radius * radius);
    }
    void Perimeter(){
        System.out.println("The Perimeter of the Circle is "+2*(3.14f)* radius);
    }

    public static void main(String[] args) {
        Practice P=new Practice();
        P.radius=6;
        P.Area();
        P.Perimeter();
    }

}