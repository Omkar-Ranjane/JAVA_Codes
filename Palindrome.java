import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int temp, inp_no, rem, sum = 0;
        
        System.out.print("Enter a no : ");
        inp_no = sc.nextInt();
        inp_no = Math.abs(inp_no);
        
        temp = inp_no;
        while (inp_no > 0) {
            rem = inp_no % 10;
            sum = (sum * 10) + rem;
            inp_no = inp_no / 10;
        }
        if (temp == sum)
            System.out.println(temp + " is palindrome no");
        else
            System.out.println(temp + " is not palindrome no");

        sc.close();
    }
}
