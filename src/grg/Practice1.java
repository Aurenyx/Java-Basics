package grg;

class Rectangle{
    private int length;
    private  int breadth;

    public Rectangle() {
        this.breadth = 5;
        this.length = 4;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

//Sphere
class Sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
// Cylinder
public class Practice1 {
    private int radius;
    private int height;

    public Practice1(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surface_area(){
        return 2* Math.PI* radius *radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return 2* Math.PI* radius *radius ;
    }

    public static void main(String[] args) {
        // Question 1
       Practice1 c=new Practice1(6,4);
        /* c.setRadius(5);
        System.out.println(c.getRadius());
        c.setHeight(6);
        System.out.println(c.getHeight());*/
        // Question 2
//        System.out.println(c.surface_area());
//        System.out.println(c.volume());
        //Question 3
        // used constructor
        //Question 4
//        Rectangle R=new Rectangle(12,13);// if we give direct value while creating objects then new explicit value will be considered
//        System.out.println(R.getLength());
//        System.out.println(R.getBreadth());
        //Question 5
        Sphere S= new Sphere();
        S.setRadius(4);
        System.out.println(S.getRadius());
    }
}
