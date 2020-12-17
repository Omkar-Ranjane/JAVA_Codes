package Problem_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter no of columns : ");
        int columns = sc.nextInt();

        int[][] inputMatrix = new int[rows][columns];
        System.out.print("Enter martix elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                inputMatrix[i][j] = sc.nextInt();
            }
        }

        Solution solution = new Solution();
        System.out.println(solution.solution(inputMatrix, rows, columns));
        
        sc.close();
    }
}
