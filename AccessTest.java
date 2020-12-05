/* 
    JAVA access modifiers are public, private  and protected.
    When a member of a class is modified by public, then that member can be accessed by any other code.
    When a member of a class is specified as private, then that member can only be accessed by other members of its class.
    Protected applies only when inheritance is involved.

    This program demonstrates the difference between public and private
*/

class Test2{
    int a;      // default access
    public int b;       // public access
    private int c;      // private access

    // method to access c
    void setc(int i){
        // set default c's value
        c = i;
    }

    int getc(){
        // get c's value
        return c;
    }
}
public class AccessTest {
    public static void main(String args[]){
        Test2 ob1 = new Test2();

        // These are OK, a and b may be accessed directly
        ob1.a = 10;
        ob1.b = 20;

        // This is not OK and will cause an error
        // ob.c = i;     // ERROR

        // You must access c through its methods
        ob1.setc(100);       // OK
        System.out.println("a, b and c : " + ob1.a + " " + ob1.b + " " + ob1.getc());
    }
}
