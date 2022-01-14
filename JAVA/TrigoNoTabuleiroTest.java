/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.math.BigInteger;

public class TrigoNoTabuleiroTest {

	@Test
	public void testCornToReceive() throws Exception {
		//Test 1
		BigInteger want = BigInteger.valueOf(0);
		BigInteger got = TrigoNoTabuleiro.cornToReceive(0);
		assertEquals(want, got);
		//Test 2
		want = BigInteger.valueOf(0);
		got = TrigoNoTabuleiro.cornToReceive(8);
		assertEquals(want, got);
		//Test 3
		want = BigInteger.valueOf(5);
		got = TrigoNoTabuleiro.cornToReceive(16);
		assertEquals(want, got);
		//Test 4
		want = BigInteger.valueOf(1398);
		got = TrigoNoTabuleiro.cornToReceive(24);
		assertEquals(want, got);
		//Test 5
		want = BigInteger.valueOf(357913);
		got = TrigoNoTabuleiro.cornToReceive(32);
		assertEquals(want, got);
		//Test 6
		want = BigInteger.valueOf(91625968);
		got = TrigoNoTabuleiro.cornToReceive(40);
		assertEquals(want, got);
		//Test 7
		want = new BigInteger("23456248059");
		got = TrigoNoTabuleiro.cornToReceive(48);
		assertEquals(want, got);
		//Test 8
		want = new BigInteger("6004799503160");
		got = TrigoNoTabuleiro.cornToReceive(56);
		assertEquals(want, got);
		//Test 9
		want = new BigInteger("1537228672809129");
		got = TrigoNoTabuleiro.cornToReceive(64);
		assertEquals(want, got);
	}
}
