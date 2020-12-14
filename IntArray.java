import java.util.Scanner;

public class IntArray {
    static int[] ArrayConvert(int n) 
    { 
    	int j = 0; 
    	int len = Integer.toString(n).length(); 
    	int[] arr = new int[len]; 
    	while(n!=0) 
    	{ 
    		arr[len-j-1] = n%10; 
    		n=n/10; 
    		j++; 
    	} 
    	return arr; 
    } 
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer number : ");
        int inputNumber = sc.nextInt();
        int[] intArray = ArrayConvert(inputNumber); 

        //for (int i = 0; i < A.length; i++) {
        //    A[i] = A[i] * 5;
        //}

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        sc.close();
    }
}
