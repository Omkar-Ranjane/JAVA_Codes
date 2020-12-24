package Introduction;
/*
    In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

    Input Format :
    There are  lines of input, and each line contains a single integer.

    Sample Input :
    > 42
    > 100
    > 125

    Sample Output :
    > 42
    > 100
    > 125
*/

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        sc.close();
    }
}
