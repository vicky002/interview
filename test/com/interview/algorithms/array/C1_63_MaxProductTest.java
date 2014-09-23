package com.interview.algorithms.array;

import com.interview.util.TestUtil;
import com.interview.utils.ConsoleWriter;
import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-9-23
 * Time: 下午10:38
 */
public class C1_63_MaxProductTest extends TestCase {
    public void test(){
        for(int i = 0; i < 10; i++) testRandom();
    }

    public void testRandom(){
        int[] array = TestUtil.generateIntArray(10, 10, 0, true);
        ConsoleWriter.printIntArray(array);
        int offset = C1_63_MaxProduct.exceptNumber(array);
        int expect = C1_63_MaxProduct.correct(array);
        System.out.println(expect + " " + offset);
        assertEquals(array[expect], array[offset]);

    }
}
