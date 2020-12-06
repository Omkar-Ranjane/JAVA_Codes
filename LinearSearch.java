import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        int[] inp_arr;
        int inp_no; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements : ");
        inp_no = sc.nextInt();
        inp_arr = new int[inp_no];
        
        System.out.print("Enter elements of array : ");
        for (int i = 0; i < inp_arr.length; i++) {
            inp_arr[i] = sc.nextInt();
        }

        System.out.print("Enter no to be find : ");
        inp_no = sc.nextInt();

        for (int i = 0; i < inp_arr.length; i++) {
             if (inp_arr[i] == inp_no) {
                 System.out.println(inp_no + " is present at location " + inp_arr[i + 1]);
                 break;
             }
        }
        sc.close();
    }
}
