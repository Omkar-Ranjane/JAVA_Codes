/*
    It is possible to define two or more methods within the same class that share the same name, 
    as long as their paramethe declarations are different. This process is reffered as method overloading.
    
    When an overload method is invoked, JAVA used the type and/or number of arguments as its guide to determine
    which version of the overload method to actually call.

    When JAVA encounters a call to an ovrload method, it is simply executes the version of the method whose parameter
    match the arguments used in the call.

    Following code demonstrate method overloading
*/

class OverloadDemo{
    void test(){
        System.out.println("No parameters");
    }

    // Overload test for one integer parameter
    void test(int a){
        System.out.println("a : " + a);
    }

    // Overload test for two integer parameter
    void test(int a, int b){
        System.out.println("a and b " + a + " " + b);
    }

    // Overload test for double parameter
    double test(double a){
        System.out.println("a : " + a);
        return a * a;
    }
}
public class Overload {
    public static void main(String args[]){
        OverloadDemo ob = new OverloadDemo();

        // Call the version of test()
        ob.test();      // test() no parameter
        ob.test(10);        // test(int a) one integer parameter
        ob.test(10, 20);        // test(int a, int b) two integer parameter
        double result = ob.test(123.25);        // test(double a) double parameter
        System.out.println("Results of ob.test(123) : " + result);
    }
}
