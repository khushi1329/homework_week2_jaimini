package homework_week2;
   /*2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.*/


public class Programme_2 {
    static int a = 10;   //static variable
    static int b = 20;

    public static void main(String[] args) {

      Programme_2.m1();

    }
    public static void m1(){     //static method

        int c = a + b;
        System.out.println("enter the first input : "+a);
        System.out.println("enter the first input : "+b);
        System.out.println("addition of two number is :" +c);

    }
}
