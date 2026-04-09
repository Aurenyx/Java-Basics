package grg;
// Q1

//class Circle{
// public int radius;
// Circle(int a){
//     this.radius=a;
// }
// double area(int radius){
//     return Math.PI*this.radius*this.radius;
// }
//}
//class Cylinder extends Circle{
//    public int height;
//    Cylinder(int h,int a){
//        super(a);
//        this.height=h;
//    }
//    double volume(int radius, int height){
//        return Math.PI*this.radius*this.radius*height;
//    }
//}

// Q2

class Rec{
   public int Len,Bre;

    public int getLen() {
        return Len;
    }

    public void setLen(int len) {
        Len = len;
    }

    public int getBre() {
        return Bre;
    }

    public void setBre(int bre) {
        Bre = bre;
    }

    Rec(int l, int b){
        System.out.println("gg");
        this.Len=l;
        this.Bre=b;
    }
    int Area(){
        return Len*Bre;
    }
}
class Cuboid extends Rec{
    int height;
    Cuboid(int h,int l,int b){

        super(l , b);
        this.height=h;
        System.out.println("ggg");
    }
    int volume(){
        return Len*Bre*height;
    }
}
public class Practice2 {
    public static void main(String[] args) {
      // Q1
//        Circle C=new Circle(5);
//        Cylinder C2=new Cylinder(5,5);
//        System.out.println(C.area(9));
//        System.out.println(C2.volume(5,6));

       // Q2
          Rec R=new Rec(2,4);
          Cuboid C=new Cuboid(3,4,5);
        System.out.println(R.Area());
        System.out.println(C.volume());
    }
}
