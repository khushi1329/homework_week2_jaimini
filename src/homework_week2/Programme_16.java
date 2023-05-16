package homework_week2;

  // Write a Java program to add two binary numbers.
  //Input Data:
  //Input first binary number: 10
  //Input second binary number: 11

public class Programme_16 {
    public static String add_Binary(String x,String y) {

        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);

        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);
         return result;
    }

    public static void main(String[] args) {
        String x = "10", y = "11";
        System.out.println("addition of two binary number is :"+ add_Binary(x,y));
    }

}
