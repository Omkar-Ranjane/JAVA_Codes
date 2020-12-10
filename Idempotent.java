import java.util.Scanner;

public class Idempotent {
    private static void matmultiply(int[][] mat, int[][] new_mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                new_mat[i][j] = 0;
                for (int j2 = 0; j2 < n; j2++) {
                    new_mat[i][j] += mat[i][j2] * mat[j2][j];
                }                
            }
        }
    }

    static boolean checkInd(int[][] mat, int n){
        int[][] new_mat = new int[n][n];
        matmultiply(mat, new_mat, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != new_mat[i][j]) {
                    return false;
                }
            }
        }
        return true;        
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dim_mat = sc.nextInt();

        System.out.println("Enter dimension of matrix : ");
        int[][] inp_mat = new int[dim_mat][dim_mat];

        System.out.println("Enter element of matrix : ");
        for (int i = 0; i < dim_mat; i++) {
            for (int j = 0; j < dim_mat; j++) {
                inp_mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is ");
        for (int i = 0; i < dim_mat; i++) {
            for (int j = 0; j < dim_mat; j++) {
                System.out.print(inp_mat[i][j] + "  ");
            }
            System.out.println();
        }

        if(checkInd(inp_mat, dim_mat))
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}
