package homework_week2;
import java.util.Scanner;

  //Write a Java program to print the sum (addition), multiply, subtract, divide and
  //remainder of two numbers.
  //Test Data:
  //Input first number: 125
  //Input second number: 24
  //Expected Output :
  //125 + 24 = 149
  //125 - 24 = 101
  //125 x 24 = 3000
  //125 / 24 = 5
  //125 mod 24 = 5

public class Programme_18 {
    public static void main(String[] args) {

      int a,b;
      Scanner sc  = new Scanner(System.in);
        System.out.println("input first number :");
        a = sc.nextInt();

        System.out.println("input second number :");
        b = sc.nextInt();

        System.out.println(a+ "+" +b+"="+(a + b));
        System.out.println(a+ "_" +b+"="+(a - b));
        System.out.println(a+ "*" +b+"="+(a * b));
        System.out.println(a+ "/" +b+"="+(a / b));
        System.out.println(a+ "mod" +b+"="+(a % b));

    }

}
