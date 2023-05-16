package homework_week2;
import java.util.Scanner;

    //Write a Java program to convert a decimal number to binary number.
//Input Data:
// Input a Decimal Number : 5
//Expected Output
//Binary number is: 101


public class Programme_17 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a decimal number :");
        int decimal=sc.nextInt();

        String result = Integer.toBinaryString(decimal);
        System.out.println("Binaryvalue of given decimal number is :" +result);

    }

}
