package org.sunnyslls.weekOfCode34;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

/**
 * Created by sunny on 18/7/17.
 */
@RunWith(JUnitParamsRunner.class)
public class OnceInaTramTest {

    OnceInaTram onceInaTram;

    public Object[] getTestCases(){
        return new Object[] {new Object[] {111111, 111120},
                            new Object[] {555555, 555564},
                new Object[] {111201, 111210},
                new Object[] {165901, 165903},
                new Object[] {165912, 165921},
                new Object[] {165903, 165912},
                new Object[] {600600, 601007},
                new Object[] {899899, 899989},
        };
    }

    @Test
    @Parameters(method = "getTestCases")
    public void getNextLuckyTicket(int input, String output){
        onceInaTram = new OnceInaTram();
        assertThat(onceInaTram.onceInATram(input), is(output));
    }
}
