package homework_week2;
import java.util.Scanner;

      //Write a program to insert any temperature value in degree Fahrenheit and
      //convert to degree Celsius ((F − Write a program to insert any temperature value in degree Fahrenheit and
      //convert to degree Celsius ((F − 32) × 5/9 = 0°C)*/
public class Programme_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float f;
        double cel;
        System.out.println("enter the temerature in fehrenheit : ");
        f = sc.nextFloat();
        cel = (f - 32)* (5/9 );

        System.out.println("fehrenheit is : " +f);
        System.out.println("  Celsius  is :" + cel);


    }



}
