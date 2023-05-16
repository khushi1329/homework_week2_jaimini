package homework_week2;
    /*4.1 Declare two instance and two static variables.
    4.2 Declare one instance method.
    4.3 Declare one static method.
    4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
    4.5 Declare the Main method.
    4.6 Call both instance and static methods into the Main method and run the programme.*/
public class Programme_4 {

    int a = 10,b = 20;  //instance variable
    static int x = 30,y = 100;  //static variable

    public static void main(String[] args) {
        Programme_4 p4 = new Programme_4();

        p4.m1();  // call by method
        Programme_4.m2();  //call by class

    }
    public void m1() {  //instance mrthod
        System.out.println("value of instance variable : "+a);
        System.out.println("value of instance variable : "+b);
    }
    public static void m2() {    //static method

        System.out.println("value for static variable : "+x);
        System.out.println("value for static variable : "+y);
    }
}