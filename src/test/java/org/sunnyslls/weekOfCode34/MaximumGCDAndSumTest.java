package org.sunnyslls.weekOfCode34;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sunnyslls.recursion.CrossWordPuzzleTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

/**
 * Created by sunny on 18/7/17.
 */
@RunWith(JUnitParamsRunner.class)
public class MaximumGCDAndSumTest {

    MaximumGCDAndSum gcdAndSum;

    public Object[] getTestCases() {
        return new Object[]{new Object[]{"input0.txt", 16},
        };
    }

    private int[][] getInputFromFile(String fileName){
        /*Scanner scanner = new Scanner(MaximumGCDAndSumTest.class.getResource(fileName).getFile());
        int size = scanner.nextInt();
        List<Integer> A = new ArrayList<>(size);
        List<Integer> B = new ArrayList<>(size);

        String[] valueA = scanner.nextLine().split(" ");
        for(int i = 0; i < size; i++){
            A.add(Integer.parseInt(valueA[i]));
        }

        String[] valueB = scanner.nextLine().split(" ");
        for(int i = 0; i < size; i++){
            A.add(Integer.parseInt(valueB[i]));
        }*/

        /*try (BufferedReader inputStream = new BufferedReader(new FileReader(fileName))) {
            String line = inputStream.readLine();
            int size = Integer.valueOf(line);
            while ((line = inputStream.readLine()) != null) {
                String[] arrA = line.split(" ");
                int[] intArrA = new int[size];
                for(int i = 0; i < size; i++){
                    intArrA[i] = Integer.valueOf(arrA[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(A);
        mainList.add(B);
        return mainList;*/
    }

    @Test
    @Parameters(method = "getTestCases")
    public void getGcmAndSum(String fileName, int output) {
        /*List<List<Integer>> list = getInputFromFile(fileName);
        gcdAndSum = new MaximumGCDAndSum();
        assertThat(gcdAndSum.maximumGcdAndSum(list.get(0), list.get(1)), is(output));*/
    }
}
