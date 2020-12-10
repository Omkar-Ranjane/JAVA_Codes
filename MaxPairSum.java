import java.util.Arrays;
import java.util.Scanner;

public class MaxPairSum {
    
    private static int sumLarge(int[] inp_arr) {
        int max1 = inp_arr[(inp_arr.length - 1)];
        int max2 = inp_arr[(inp_arr.length - 2)];
        return max1 + max2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of inputs : ");
        int n = sc.nextInt();

        int[] inp_arr = new int[n];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < inp_arr.length; i++) {
            inp_arr[i] = sc.nextInt();
        }

        Arrays.sort(inp_arr);

        System.out.println("Largest sum is " + sumLarge(inp_arr));
        
        sc.close();
    }
}
