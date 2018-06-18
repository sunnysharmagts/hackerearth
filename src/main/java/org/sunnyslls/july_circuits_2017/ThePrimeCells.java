package org.sunnyslls.july_circuits_2017;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sunny on 2/8/17.
 */
public class ThePrimeCells {

    private static final Map<Integer, Boolean> map = new HashMap<>();
    static int length;
    static int[] rowCache;
    static int[] columnCache;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        int[][] grid = new int[length][length];
        rowCache = new int[length];
        columnCache = new int[length];

        for(int i = 0; i < length; i++){
            int total = 0;
            for(int j = 0; j < length; j++){
                int value = scanner.nextInt();
                grid[i][j] = value;
                total += value;
                columnCache[j] += value;
            }
            rowCache[i] = total;
        }
        for(int i : rowCache){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : columnCache){
            System.out.print(i+" ");
        }
        ThePrimeCells primeCells = new ThePrimeCells();
        primeCells.primeCells(grid);
        scanner.close();
    }

    void primeCells(int[][] grid){
        int length = grid.length;
        int total = 0;
        for(int i = 0; i < length; i++){
            for(int  j = 0; j < length; j++){
                if(isPrime(getTotal(grid, i, j))){
                    total++;
                }
            }
        }
        System.out.println(total);
    }

    int getTotal(int[][] grid, int i, int j){
        int total = 0;
        if(j >= 0 && j < length){
            total += rowCache[i] - grid[i][j];
        }
        System.out.print("Row: "+total);
        if(i >= 0 && j < length){
            System.out.print(" Column: "+(columnCache[j] - grid[i][j]));
            total += columnCache[j] - grid[i][j];
        }
        System.out.println(" Total: "+total);
        return total;
    }

    static boolean isPrime(int n){
        if(map.containsKey(n)) return map.get(n);

        if(n%2 == 0) {
            map.put(n, false);
            return false;
        }
        for(int i = 3; i*i < n; i+=2){
            if(n % i == 0) {
                map.put(n, false);
                return false;
            }
        }
        map.put(n, true);
        return true;
    }
}
