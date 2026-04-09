package grg;

class Animal{
    Animal(){
        System.out.println("All animals are friendly");
    }
    Animal(int i){
        System.out.println("Animals with "+i+" legs");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dogs are friendly and loyal");
    }
    Dog(int c){
        super();
        System.out.println("Dogs with "+c+" eyes");
    }
    Dog(int c,int l){
        super(c);
        System.out.println("Dogs with "+c+" eyes and "+l+" legs");
    }
}

public class Inheritance {
    public static void main(String[] args) {
//         Animal A=new Animal();// Gives only Animal class o/p
//        Dog D=new Dog();// Gives both class o/p's
          Dog A= new Dog(2,4);// Also executes both classes

    }
}