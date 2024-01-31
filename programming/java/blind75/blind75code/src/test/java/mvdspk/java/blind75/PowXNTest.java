package mvdspk.java.blind75;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowXNTest {
    // n odd

    // n even


    // n == 0

    // n == 1

    //what if pow(x,n) > java int?
    // assuming n < 31
@Test
    public void testNisOdd(){
        PowXN powXN = new PowXN();

        assertEquals(3125, powXN.pow(5, 5));
    }


@Test
    public void testNisEven(){
        PowXN powXN = new PowXN();

        assertEquals(625, powXN.pow(5, 4));
    }

    @Test
    public void testNisOne(){
        PowXN powXN = new PowXN();

        assertEquals(5, powXN.pow(5, 1));
    }

    @Test
    public void testNisZero(){
        PowXN powXN = new PowXN();

        assertEquals(1, powXN.pow(5, 0));
    }
}
