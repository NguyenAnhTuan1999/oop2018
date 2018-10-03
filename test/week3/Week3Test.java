package week3;

import org.junit.Test;
import static org.junit.Assert.*;
import static week3.Week3.calculateBMI;
import static week3.Week3.max;
import static week3.Week3.minOfArray;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(1, max(1 , 0));
        assertEquals(100, max(20, 100));
        assertEquals(12, max(12, 10));
        assertEquals(0, max(0, -10));
        assertEquals(-6, max(-6, -7));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] a = {1, 2, 3, 4, 5};
        assertEquals(1, minOfArray(a));

        int[] b = {-10, 0, -89, 10, 7};
        assertEquals(-89, minOfArray(b));

        int[] c ={7, 0, 10, 11, 13, 1, 98, 200, 120};
        assertEquals(0, minOfArray(c));

        int[] d = new int[100];
        for(int i=0; i<100; i++){
            d[i] = 100 - i;
        }
        assertEquals(1, minOfArray(d));

        int[] e = {100};
        assertEquals(100, minOfArray(e));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        assertEquals("Thiếu cân", calculateBMI(52, 1.73));

    }
}
