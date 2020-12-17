package Problem_2;

import java.util.Scanner;

public class Solution {
    public int solution(int[][] inputMatrix, int row, int column) {
        int validTriangles = 0, maxWeight = 0;
        Scanner sc = new Scanner(System.in);

        // Count valid triangles in matrix
        for (int r = 2; r <= row; r++) {
            validTriangles = ((row - r + 1) * (column - 2 * (r) + 2));
            maxWeight = calculateWeight(validTriangles, inputMatrix, row, column);
        }
        return 0;
    }

    private int calculateWeight(int validTriangles, int[][] inputMatrix, int row, int column) {
        int maxWeight;
        
        return maxWeight;
    }
}
