package org.sunnyslls.recursion;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

/**
 * Created by sunny on 15/7/17.
 */

@RunWith(JUnitParamsRunner.class)
public class RepetitiveKSumsTest {

    private RepetitiveKSums repetitiveKSums;

    public Object[] getTestCases() {

        return new Object[]{
                /*new Object[]{new Object[] {1, 3, new int[]{3}}, new int[]{1}},
                new Object[]{new Object[] {2, 2, new int[]{12,34,56}}, new int[]{6,28}},
                new Object[]{new Object[] {3, 2, new int[]{2,3,4,4,5,6}}, new int[]{1,2,3}},*/
                new Object[]{new Object[] {10, 1, new int[]{13,23,23,23,27,27,52,52,53,53}}, new int[]{}},
                new Object[]{new Object[] {11, 1, new int[]{5,20,20,24,29,51,51,51,73,78,92}}, new int[]{}},
                new Object[]{new Object[] {3, 3, new int[]{18,32,38,46,52,58,60,66,72,78}}, new int[]{}},
                new Object[]{new Object[] {4, 3, new int[]{36,37,38,39,42,43,43,44,44,45,48,49,49,50,50,51,54,55,56,57}}, new int[]{}},
                new Object[]{new Object[] {1, 8, new int[]{16}}, new int[]{}},
                new Object[]{new Object[] {4, 2, new int[]{18,20,22,23,25,28,31,33,36,44}}, new int[]{}},
                new Object[]{new Object[] {2, 18, new int[]{0,3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54}}, new int[]{}},
                new Object[]{new Object[] {2, 19, new int[]{19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19}}, new int[]{}},
                new Object[]{new Object[] {5, 2, new int[]{24,24,24,24,24,24,24,24,24,24,53,53,53,53,82}}, new int[]{}},
                new Object[]{new Object[] {3, 4, new int[]{0,8,16,17,24,25,32,33,34,41,42,50,51,59,68}}, new int[]{}},
        };
    }

    @Test
    @Parameters(method = "getTestCases")
    public void testKSums(Object[] input, int[] output) {
        repetitiveKSums = new RepetitiveKSums();
        int n = (int)input[0];
        int k = (int)input[1];
        int[] kArr = (int[]) input[2];
        assertThat(repetitiveKSums.checkKSums(n, k, kArr), is(output));
    }
}
