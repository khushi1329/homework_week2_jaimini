package homework_week2;
import java.util.Scanner;

  //program that takes three numbers as input to calculate and
//print the average of the numbers

public class Programme_13 {

    public static void main(String[] args) {

        int a,b,c,avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first value :");
        a = sc.nextInt();
        System.out.println("enter second value :");
        b = sc.nextInt();
        System.out.println("enter third value :");
        c = sc.nextInt();
        avg = (a + b + c)/2;
        System.out.println("average of three values :" +avg);
    }
}
