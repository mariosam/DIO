/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class AcimaDaDiagonalPrincipalTest {

	@Test
	public void testAcimaDaDiagonalPrincipal() throws Exception {
        ArrayList<Double> ops = new ArrayList<>();
        ops.add(-19.0);
        ops.add(0.0);
        ops.add(-7.0);
        ops.add(13.0);
        ops.add(-4.0);
        ops.add(46.0);
        ops.add(23.0);
        ops.add(-28.0);
        ops.add(33.0);
        ops.add(-28.0);
        ops.add(-31.0);
        ops.add(25.0);
        ops.add(-9.0);
        ops.add(29.0);
        ops.add(-48.0);
        ops.add(36.0);
        ops.add(7.0);
        ops.add(-8.0);
        ops.add(48.0);
        ops.add(34.0);
        ops.add(-42.0);
        ops.add(31.0);
        ops.add(-11.0);
        ops.add(-41.0);
        ops.add(25.0);
        ops.add(-20.0);
        ops.add(-46.0);
        ops.add(14.0);
        ops.add(34.0);
        ops.add(49.0);
        ops.add(38.0);
        ops.add(-29.0);
        ops.add(36.0);
        ops.add(30.0);
        ops.add(40.0);
        ops.add(36.0);
        ops.add(38.0);
        ops.add(0.0);
        ops.add(10.0);
        ops.add(-41.0);
        ops.add(-8.0);
        ops.add(-21.0);
        ops.add(-7.0);
        ops.add(-46.0);
        ops.add(-24.0);
        ops.add(29.0);
        ops.add(11.0);
        ops.add(-22.0);
        ops.add(4.0);
        ops.add(12.0);
        ops.add(8.0);
        ops.add(-45.0);
        ops.add(19.0);
        ops.add(29.0);
        ops.add(1.0);
        ops.add(-29.0);
        ops.add(-4.0);
        ops.add(-28.0);
        ops.add(-16.0);
        ops.add(-38.0);
        ops.add(14.0);
        ops.add(39.0);
        ops.add(35.0);
        ops.add(-19.0);
        ops.add(16.0);
        ops.add(-12.0);
        ops.add(-20.0);
        ops.add(20.0);
        ops.add(15.0);
        ops.add(5.0);
        ops.add(-37.0);
        ops.add(38.0);
        ops.add(4.0);
        ops.add(4.0);
        ops.add(8.0);
        ops.add(-31.0);
        ops.add(24.0);
        ops.add(22.0);
        ops.add(2.0);
        ops.add(16.0);
        ops.add(47.0);
        ops.add(-48.0);
        ops.add(6.0);
        ops.add(32.0);
        ops.add(18.0);
        ops.add(10.0);
        ops.add(36.0);
        ops.add(-1.0);
        ops.add(-23.0);
        ops.add(46.0);
        ops.add(20.0);
        ops.add(-47.0);
        ops.add(-17.0);
        ops.add(32.0);
        ops.add(-47.0);
        ops.add(-8.0);
        ops.add(9.0);
        ops.add(26.0);
        ops.add(-47.0);
        ops.add(12.0);
        ops.add(26.0);
        ops.add(45.0);
        ops.add(24.0);
        ops.add(-4.0);
        ops.add(8.0);
        ops.add(-46.0);
        ops.add(-29.0);
        ops.add(13.0);
        ops.add(9.0);
        ops.add(48.0);
        ops.add(11.0);
        ops.add(36.0);
        ops.add(-40.0);
        ops.add(18.0);
        ops.add(-28.0);
        ops.add(41.0);
        ops.add(40.0);
        ops.add(47.0);
        ops.add(-34.0);
        ops.add(34.0);
        ops.add(-28.0);
        ops.add(-34.0);
        ops.add(-41.0);
        ops.add(-24.0);
        ops.add(-42.0);
        ops.add(0.0);
        ops.add(48.0);
        ops.add(-26.0);
        ops.add(16.0);
        ops.add(-48.0);
        ops.add(6.0);
        ops.add(26.0);
        ops.add(5.0);
        ops.add(15.0);
        ops.add(-33.0);
        ops.add(-33.0);
        ops.add(-48.0);
        ops.add(-3.0);
        ops.add(-31.0);
        ops.add(-29.0);
        ops.add(-36.0);
        ops.add(-47.0);
        ops.add(-44.0);
        ops.add(10.0);
        //Test 1
        double want = 121.0;
        //double got = AcimaDaDiagonalPrincipal.mathResult("S", new double[] {-19,0,-7,13,-4,46,23,-28,33,-28,-31,25,-9,29,-48,36,7,-8,48,34,-42,31,-11,-41,25,-20,-46,14,34,49,38,-29,36,30,40,36,38,0,10,-41,-8,-21,-7,-46,-24,29,11,-22,4,12,8,-45,19,29,1,-29,-4,-28,-16,-38,14,39,35,-19,16,-12,-20,20,15,5,-37,38,4,4,8,-31,24,22,2,16,47,-48,6,32,18,10,36,-1,-23,46,20,-47,-17,32,-47,-8,9,26,-47,12,26,45,24,-4,8,-46,-29,13,9,48,11,36,-40,18,-28,41,40,47,-34,34,-28,-34,-41,-24,-42,0,48,-26,16,-48,6,26,5,15,-33,-33,-48,-3,-31,-29,-36,-47,-44,10});
        double got = AcimaDaDiagonalPrincipal.mathResult("S", ops);
        assertEquals(want, got, 0.1);
        //Test 2
        want = 1.8;
        //got = AcimaDaDiagonalPrincipal.mathResult("M", new double[] {-19,0,-7,13,-4,46,23,-28,33,-28,-31,25,-9,29,-48,36,7,-8,48,34,-42,31,-11,-41,25,-20,-46,14,34,49,38,-29,36,30,40,36,38,0,10,-41,-8,-21,-7,-46,-24,29,11,-22,4,12,8,-45,19,29,1,-29,-4,-28,-16,-38,14,39,35,-19,16,-12,-20,20,15,5,-37,38,4,4,8,-31,24,22,2,16,47,-48,6,32,18,10,36,-1,-23,46,20,-47,-17,32,-47,-8,9,26,-47,12,26,45,24,-4,8,-46,-29,13,9,48,11,36,-40,18,-28,41,40,47,-34,34,-28,-34,-41,-24,-42,0,48,-26,16,-48,6,26,5,15,-33,-33,-48,-3,-31,-29,-36,-47,-44,10});
        got = AcimaDaDiagonalPrincipal.mathResult("M", ops);
		    assertEquals(want, got, 0.1);
	}

}
