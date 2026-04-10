package grg;

public class Multidimensional {
    public static void main(String[] args) {
        //2D array
        int [][] a=new int[2][3];
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[1][0]=11;
        a[1][1]=12;
        a[1][2]=13;
//        System.out.println(a[0][2]);
//        System.out.println(a[1][2]);
//        System.out.println(a[0][0]);

        //3D array
//        int[][][]B=new int[2][3][4];
//        B[0][0][0]=1;
//        B[0][1][1]=2;
//        B[0][0][2]=3;
//        B[0][0][3]=4;
//        B[0][0][0]=5;
//        B[0][0][0]=6;
//        B[0][0][0]=7;
//        B[0][0][0]=8;
//        B[0][0][0]=9;
//        B[0][0][0]=10;
//        B[0][0][0]=11;
//        B[0][0][0]=12;


        // Displaying 2D array
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(" ");
        }





    }
}
