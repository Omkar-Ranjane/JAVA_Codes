import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String args[]) {
        int inp_no, temp, sum = 0, rem;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no : ");
        inp_no = sc.nextInt();
        inp_no = Math.abs(inp_no);

        temp = inp_no;
        while (inp_no > 0) {
            rem = inp_no % 10;
            sum = sum + (rem * rem * rem);
            inp_no = inp_no / 10;
        }

        if(temp == sum)
            System.out.println(temp + " is armstrong no");
        else
            System.out.println(temp + " is not armstrong no");

        sc.close();
    }    
}
