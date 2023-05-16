package homework_week2;
/*1.1 Declare two instance variables.
        1.2 Declare one instance method.
        1.3 Call both instance variables into the instance method inside the print statement.
        1.4 Declare the Main method.
        1.5 Call the above instance method into the Main method and Run the programme.*/

public class Programme_1 {

        int a = 10 ; // instance variable
        String name = "Testing";

        public static void main(String[] args) {
           Programme_1 p1 = new Programme_1();
           p1.m1(); // call by object
        }
        public void m1(){
          //instance method
            System.out.println("enter the first input: " + a);
            System.out.println("enter the second input:" + name);
        }

    }



