package Problem_1;

import java.util.Scanner;

public class Round1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of grooms : ");
        int groomNo = sc.nextInt();

        int[] grooms = new int[groomNo];
        System.out.print("Enter elements in array : ");
        for (int i = 0; i < grooms.length; i++) {
            grooms[i] = sc.nextInt();
        }        

        System.out.print("Enter no of brides : ");
        int brides = sc.nextInt();

        System.out.print("Enter 1st round shortlist : ");
        int firstRoundShort = sc.nextInt();

        System.out.print("Enter 2nd round shortlist : ");
        int secondRoundShort = sc.nextInt();

        Solution1 firsSolution1 = new Solution1();
        System.out.println(firsSolution1.solution(groomNo, grooms, brides, firstRoundShort, secondRoundShort);

        sc.close();
    }
}
