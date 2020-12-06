import java.util.Scanner;

public class PrimeNo {
    public static void main(String args[]) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no : ");
        int inp_no = sc.nextInt();

        for (int i = 2; i < inp_no; i++) {
            if (inp_no % i == 0) {
                flag = 1;
                break;
            }
        }

        if(flag == 1)
            System.out.println(inp_no + " is prime no");
        else    
            System.out.println(inp_no + " is not a prime no");

        sc.close();
    }   
}
