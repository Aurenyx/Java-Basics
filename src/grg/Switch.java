package grg;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter age");
        Scanner sc= new Scanner(System.in);

        age=sc.nextInt();

        switch (age){
            case 5:
                System.out.println("Children");
                break;
            case 18:
                System.out.println("Adult");
                break;
            case 60:
                System.out.println("Retirement");
                break;
            default:
                System.out.println("Find your ikegai");

        }
        String name;
        System.out.println("Write Name");
        Scanner b= new Scanner(System.in);
        name=b.nextLine();

        switch (name){
            case "Govind":
                System.out.println("Ambivert");
                break;
            case "Sarthak":
                System.out.println("Introvert");
                break;
            case "Abhi":
                System.out.println("Extrovert");
                break;
            default:
                System.out.println("Just Friends");
        }


    }
}
