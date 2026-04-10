package grg;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 30;
        a[1] = 60;
        a[3] = 20;
        a[4] = 40;
        a[2] = 90;
        System.out.println(a[0]);
        //or
        int[] b = {10, 20, 30, 40, 50};
        System.out.println(b[4]);
        //length of an array
        System.out.println(b.length);
    }
}
