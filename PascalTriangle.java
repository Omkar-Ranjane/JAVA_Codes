import java.util.Scanner;

public class PascalTriangle {
    static int factorial(int n){
        int f;
        for (f = 1; n > 1; n--) {
            f *= n;
        }
        return f;
    }

    static int ncr(int n, int r){
        return factorial(n) / (factorial(n - r) * factorial(r));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no of lines : ");
        int inp_no = sc.nextInt();

        for (int i = 0; i <= inp_no; i++) {
           // for (j = 0; j <= (inp_no - 1); j++) {
           //     System.out.print(" ");
           // }
            for (int j = 0; j < i ; j++) {
                System.out.print(" " + ncr(i, j));
            }
            System.out.println();
        }
        sc.close();
    }
}
