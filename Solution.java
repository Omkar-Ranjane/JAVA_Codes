import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[][] arrayMatrix; 
        int[] intArray;

        System.out.print("Enter no of elements in array : ");
        int elementArray = sc.nextInt();

        System.out.print("Enter elements of array : ");
        intArray = new int[elementArray];

        for (int i = 0; i < elementArray; i++) {
            intArray[i] = sc.nextInt();
        }

        
        System.out.print("Enter no of elements in matrix : ");
        int matrixElement = sc.nextInt();
      
        arrayMatrix = new int[matrixElement][matrixElement];
        int count = 0;

        for (int i = 0; i < matrixElement; i++) {
            for (int j = 0; j < matrixElement; j++) {
                if (count == intArray.length) {
                    break;
                }
                arrayMatrix[i][j] = intArray[count];
                count++;
            }
        }

        System.out.println("Converted matrix : ");
        for (int i = 0; i < matrixElement; i++) {
            for (int j = 0; j < matrixElement; j++) {
                System.out.print(arrayMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
