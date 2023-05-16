package homework_week2;
   /*3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
   3.5 Declare the Main method.
   3.6 Call both instance and static methods into the Main method and run the programme.*/
      public class Programme_3 {


    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Programme_3 p3 = new Programme_3();

        p3.m1();  // call by method
        Programme_3.m2();  //call by class

    }
    public void m1() {
        System.out.println("value of instance variable : "+a);
    }
    public static void m2() {

        System.out.println("value for static variable : "+b);

    }
}