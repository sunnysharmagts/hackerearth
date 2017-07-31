package org.sunnyslls.recursion;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by sunny on 11/7/17.
 */
@RunWith(JUnitParamsRunner.class)
public class PowerSumTest {
    PowerSum powerSum;

    public int[][] input(){
        return new int[][] {
                new int[] {10, 2},
                new int[] {100, 3}
        };
    }

    @Test
    @Parameters(method = "input")

    public void getPowerNumbers(){
        int[][] inputParameter = input();
        powerSum = new PowerSum();

        for(int[] i : inputParameter){
            assert (powerSum.getPowerSum(i[0], i[1]));
        }
    }

}
