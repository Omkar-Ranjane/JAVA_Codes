import java.util.Scanner;

public class BubbleSort{
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - 1); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] inp_arr;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements : ");
        int inp_no = sc.nextInt();
        inp_arr = new int[inp_no];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < inp_arr.length; i++) {
            inp_arr[i] = sc.nextInt();
        }

        System.out.println("Array before sort : ");
        for (int i = 0; i < inp_arr.length; i++) {
            System.out.print(inp_arr[i] + " ");
        }

        bubbleSort(inp_arr);

        System.out.println("Array after sort : ");
        for (int i = 0; i < inp_arr.length; i++) {
            System.out.print(inp_arr[i] + " ");
        }
        sc.close();
    }
}