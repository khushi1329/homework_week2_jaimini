package homework_week2;

  //Write a Java program to swap two variables.

public class Programme_15 {

    public static void main(String[] args)
    {

        int a = 1;
        int b = 2;

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

