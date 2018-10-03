package week3;

import org.junit.Test;
import static org.junit.Assert.*;
import static week3.Week3.calculateBMI;
import static week3.Week3.max;
import static week3.Week3.minOfArray;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax1(){
        assertEquals(1, max(1 , 0));
    }
    @Test
    public void testMax2(){
        assertEquals(100, max(20, 100));
    }
    @Test
    public void testMax3(){
        assertEquals(12, max(12, 10));
    }
    @Test
    public void testMax4(){
        assertEquals(0, max(0, -10));
    }
    @Test
    public void testMax5(){
        assertEquals(-6, max(-6, -7));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray1(){
        int[] a = {1, 2, 3, 4, 5};
        assertEquals(1, minOfArray(a));
    }
    @Test
    public void testMinOfArray2(){
        int[] b = {-10, 0, -89, 10, 7};
        assertEquals(-89, minOfArray(b));
    }
    @Test
    public void testMinOfArray3(){
        int[] c ={7, 0, 10, 11, 13, 1, 98, 200, 120};
        assertEquals(0, minOfArray(c));
    }
    @Test
    public void testMinOfArray4(){
        int[] d = new int[100];
        for(int i=0; i<100; i++){
            d[i] = 100 - i;
        }
        assertEquals(1, minOfArray(d));
    }
    @Test
    public void testMinOfArray5(){
        int[] e = {100};
        assertEquals(100, minOfArray(e));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI1(){
        assertEquals("Thiếu cân", calculateBMI(52, 1.73));
    }
    @Test
    public void testCalculateBMI2(){
        assertEquals("Bình thường", calculateBMI(80, 1.9));
    }
    @Test
    public void testCalculateBMI3(){
        assertEquals("Thừa cân", calculateBMI(46, 1.4));
    }
    @Test
    public void testCalculateBMI4(){
        assertEquals("Béo phì", calculateBMI(100, 1.5));
    }
    @Test
    public void testCalculateBMI5(){
        assertEquals("Thiếu cân", calculateBMI(40, 1.7));
    }
}
