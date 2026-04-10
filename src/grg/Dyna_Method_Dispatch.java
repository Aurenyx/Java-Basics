package grg;

class Phone{
    void call(){
        System.out.println("Calling from phone..");
    }
    void name(){
        System.out.println("I am Nokia");
    }
}
class SmartPhone extends Phone{
    void music(){
        System.out.println("Playing music..");
    }
    @Override
    void name(){
        System.out.println("I am Apple");
    }
}

public class Dyna_Method_Dispatch {
    public static void main(String[] args) {
//        Phone p = new Phone();
//        p.call();
//        p.name();
//        SmartPhone s=new SmartPhone();
//        s.music();
//        s.name();
        Phone p1=new SmartPhone();//Allowed super-sub
//        SmartPhone s=new Phone();// this is not allowed sub-super
        p1.call();//can call any method of super class which are not override
        p1.name();// sub class override methods get called only
    }
}
