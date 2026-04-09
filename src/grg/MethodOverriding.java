package grg;

class Meth1{
    Meth1(){
        System.out.println("I am the constructor of the parent class");
    }
    void Method(){
        System.out.println("I am the method of parent class");
    }
}
public class MethodOverriding {
    MethodOverriding(){
        System.out.println("I am a constructor of child class");
    }
    void Method(){
        System.out.println("I am the Method of the child class");
    }
    public static void main(String[] args) {
        Meth1 M1=new Meth1();
//        M1.Method();
        MethodOverriding M2=new MethodOverriding();
        M2.Method();
    }
}


