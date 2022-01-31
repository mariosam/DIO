/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReservatorioDeMelTest  {

	@Test
	public void testReservatorioDeMel() throws Exception {
        //Test 1
        double want = 2.96;
        double got = ReservatorioDeMel.getHigh(1450.00, 25.00);
        assertEquals(want, got, 0.01);
        //Test 2
        want = 0.61;
        got = ReservatorioDeMel.getHigh(760.00, 40.00);
        assertEquals(want, got, 0.01);
        //Test 3
        want = 42.46;
        got = ReservatorioDeMel.getHigh(7500.00, 15.00);
        assertEquals(want, got, 0.01);
        //Test 1
        want = 490.62;
        got = ReservatorioDeMel.getArea(25.00);
        assertEquals(want, got, 0.01);
        //Test 2
        want = 1256.00;
        got = ReservatorioDeMel.getArea(40.00);
        assertEquals(want, got, 0.01);
        //Test 3
        want = 176.62;
        got = ReservatorioDeMel.getArea(15.00);
        assertEquals(want, got, 0.01);

        want = 1.27;
        got = ReservatorioDeMel.getHigh(1.00, 1.00); 
        assertEquals(want, got, 0.01);
        want = 0.79;
        got = ReservatorioDeMel.getArea(1.00);
        assertEquals(want, got, 0.01); 

        want = 1.27;
        got = ReservatorioDeMel.getHigh(10000.00, 100.00); 
        assertEquals(want, got, 0.01);
        want = 7850.00;
        got = ReservatorioDeMel.getArea(100.00); 
        assertEquals(want, got, 0.01);

        want = 2.96;
        got = ReservatorioDeMel.getHigh(1450.00, 25.00); 
        assertEquals(want, got, 0.01);
        want = 490.62;
        got = ReservatorioDeMel.getArea(25.00); 
        assertEquals(want, got, 0.01);

        want = 0.61;
        got = ReservatorioDeMel.getHigh(760.00, 40.00); 
        assertEquals(want, got, 0.01);
        want = 1256.00;
        got = ReservatorioDeMel.getArea(40.00); 
        assertEquals(want, got, 0.01);

        want = 42.46;
        got = ReservatorioDeMel.getHigh(7500.00, 15.00); 
        assertEquals(want, got, 0.01);
        want = 176.62;
        got = ReservatorioDeMel.getArea(15.00); 
        assertEquals(want, got, 0.01);

        want = 0.00;
        got = ReservatorioDeMel.getHigh(1.00, 100.00); 
        assertEquals(want, got, 0.01);
        want = 7850.00;
        got = ReservatorioDeMel.getArea(100.00); 
        assertEquals(want, got, 0.01);

        want = 12738.85;
        got = ReservatorioDeMel.getHigh(10000.00, 1.00); 
        assertEquals(want, got, 0.01);
        want = 0.79;
        got = ReservatorioDeMel.getArea(1.00); 
        assertEquals(want, got, 0.01);

	}

}
