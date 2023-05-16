package homework_week2;
import java.util.Scanner;

       //Write a program to calculate the area of a triangle.

public class Programme_8 {

    public static void main(String[] args) {

        // base and height
        int base = 0;
        int height = 0;
        int  area = 0;

        Scanner Scanner = new Scanner(System.in);

        System.out.println("enter the lenght of  base of triangle : +");
        base = Scanner.nextInt();

        System.out.println("enter the lenght of height of triangle : +");
        height = Scanner.nextInt();


        area = (base * height)/2;

        System.out.println("the area of triangle : " + area);
    }
}
