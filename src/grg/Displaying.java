package grg;

public class Displaying {
    public static void main(String[] args) {
        int[]arr={1,3,5,7,9};
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        for (int i=arr.length-1;i>=0;i-- ){
//            System.out.println(arr[i]);
//            //reverse order
//        }

        // by using for each loop
        for (int element:arr){
            System.out.println(element);
        }
    }
}
