package homework_week2;
/*. Write a program for a calculator with addition, subtraction, multiplication
    and division methods all with parameters and use string concatenation
    methods.(Note: Two static and Two instance methods.*/


public class Programme_5 {

    private static Object divi;
    int a,b,c;

    public static void main(String[] args) {
         Programme_5 p5 = new Programme_5();
         p5.add(10,20);
         p5.sub(20,10);  // call by object

        Programme_5.multi(10,20);  //call by class
        Programme_5.divi(30,2);

    }
      public void add(int a,int b){      //instance method
        c = a + b;
          System.out.println("addition of two number is :" +c);

      }
    public void sub(int a, int b){
        c = a - b;
        System.out.println("subtraction of two number is :" +c);

    }
    public static void multi(int a, int b){   //static method

        int ans = a * b;
        System.out.println("multiplication of two number is :" +ans);

    }
    public static void divi(int a, int b){    //static method

        int ans = a /b;
        System.out.println("Division of two number is :" +ans);

    }

}
