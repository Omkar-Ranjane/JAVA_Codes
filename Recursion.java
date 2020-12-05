// A Simple Example of Recursion

class Factorial{
    int fact(int n){
        int result;

        if (n == 1) {
            return 1;
        } else {
            result = fact(n - 1) * n;
            return result;
        }
    }
}

public class Recursion {
    public static void main(String args[]){
        Factorial f = new Factorial();

        System.out.println("Factorial of 3 is " + f.fact(3));
    }
}
