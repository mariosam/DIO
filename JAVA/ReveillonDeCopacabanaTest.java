/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReveillonDeCopacabanaTest {

	@Test
	public void testReveillonDeCopacabana() throws Exception {
		//Test 1
		int want = 25;
		int got = ReveillonDeCopacabana.howManyOrdersPerPeople(13);
		assertEquals(want, got);
		//Test 2
		want = 73;
		got = ReveillonDeCopacabana.howManyOrdersPerPeople(37);
		assertEquals(want, got);
		//Test 3
		want = 97;
		got = ReveillonDeCopacabana.howManyOrdersPerPeople(49);
		assertEquals(want, got);
		//Test 4
		want = 21;
		got = ReveillonDeCopacabana.howManyOrdersPerPeople(11);
		assertEquals(want, got);
		//Test 5
		want = 17;
		got = ReveillonDeCopacabana.howManyOrdersPerPeople(9);
		assertEquals(want, got);
		//Test 6
		want = 9;
		got = ReveillonDeCopacabana.howManyOrdersPerPeople(5);
		assertEquals(want, got);
		//Test 7
		want = 33;
		got = ReveillonDeCopacabana.howManyOrdersPerPeople(17);
		assertEquals(want, got);
	}

}
