package org.sunnyslls.CodeArena;

/**
 * Created by sunny on 27/7/17.
 * <p>
 * Given an array A of size N. Given Q operations, each operation contains an integer D. In each operation you have to divide all the elements of the array by D.
 * <p>
 * For example, for each operation with a given D, the new array A would be:
 * <p>
 * A[0] / D, A[1] / D, A[2] / D, ..... , A[N-1] / D
 * Finally, after processing all the operations you have to print the final array after Q operations.
 * Note : The result of the each division will be an integer, for example 5 / 2 = 2
 * <p>
 * Input :
 * First line of input contains a single integer N denoting number of elements in the array A. Next line of input contains N space separated integers denoting the elements of array A. Next line contains Q denoting number of operations. Next Q lines contains a single integer D by which divide the elements of the array.
 * <p>
 * Output :
 * Print single line containing N space separated integers after processing Q operations.
 * <p>
 * Constraints:
 * 1<=N<=100000
 * 1<=Ai<=1000000
 * 1<=Q<=100000
 * 1<=D<=1000
 * <p>
 * SAMPLE INPUT
 * 5
 * 50 20 18 27 19
 * 3
 * 2
 * 3
 * 2
 * <p>
 * <p>
 * SAMPLE OUTPUT
 * 4 1 1 2 1
 * Explanation
 * In operation 1 after dividing the whole array by D=2, the resultant array will be : [25, 10, 9, 13, 9] In operation 2 after dividing the array from operation 1 by 3, the resultant array will be : [8, 3, 3, 4, 3] In operation 3 after dividing the array from operation 2 by 2, the resultant array will be : [4, 1, 1, 2, 1] So, the resultant array will be [4, 1, 1, 2, 1]
 */

import java.util.Scanner;

public class DivideByD {
    public static void main(String args[]) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
         */

        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            arr[i] = value;
        }

        final int Q = scanner.nextInt();

        int D = 1;
        for (int k = 0; k < Q; k++) {
            D *= scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int value = arr[i] / D;
            System.out.print(value + " ");
        }
    }
}
