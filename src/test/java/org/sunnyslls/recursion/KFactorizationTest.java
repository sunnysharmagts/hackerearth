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
public class KFactorizationTest {

    private KFactorization factorization;

    public Object[] getTestCases() {

        return new Object[]{
                new Object[]{new Object[]{12, 3, new int[]{2, 3, 4}}, new Object[]{1, 3, 12}},
                new Object[]{new Object[]{969000000, 8, new int[]{2, 3, 5, 7, 11, 13, 17, 19}}, new Object[]{1, 2, 4, 8, 16, 32, 64, 192, 960, 4800, 24000, 120000, 600000, 3000000, 51000000, 969000000}},
                new Object[]{new Object[]{399000000, 8, new int[]{2, 3, 5, 7, 11, 13, 17, 19}}, new Object[]{1,2,4,8,16,32,64,192,960,4800,24000,120000,600000,3000000,21000000,399000000}},
                new Object[]{new Object[]{924000000, 8, new int[]{2, 3, 5, 7, 11, 13, 17, 19}}, new Object[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 768, 3840, 19200, 96000, 480000, 2400000, 12000000, 84000000, 924000000}},
                new Object[]{new Object[]{858000000, 8, new int[]{2, 3, 5, 7, 11, 13, 17, 19}}, new Object[]{1,2,4,8,16,32,64,128,384,1920,9600,48000,240000,1200000,6000000,66000000,858000000}},
        };
    }

    @Test
    @Parameters(method = "getTestCases")
    public void testKFactors(Object[] input, Object[] output) {
        int number = (int) input[0];
        int factorSize = (int) input[1];
        int[] factors = (int[]) input[2];
        factorization = new KFactorization();
        assertThat(factorization.factorization(number, factorSize, factors), is(output));
    }
}
