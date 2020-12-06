import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String args[]) {
        int inp_no, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no : ");
        inp_no = sc.nextInt();
        inp_no = Math.abs(inp_no);

        for (int i = inp_no; i >=1 ; i = i / 10) {
            sum = sum + ((i % 10) * (i % 10) * (i % 10));
        } 

        if(inp_no == sum)
            System.out.println(inp_no + " is armstrong no");
        else
            System.out.println(inp_no + " is not armstrong no");

        sc.close();
    }    
}
