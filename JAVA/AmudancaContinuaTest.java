/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class AmudancaContinuaTest {

	@Test
	public void testAmudancaContinua() throws Exception {
		//Test 1
		String[] want = {"Bom Dia!!","06","06","00"};
		String[] got = AmudancaContinua.salutationTime(1.50);
    assertArrayEquals(want, got);
		//Test 2
		want = new String[] {"Boa Tarde!!","12","22","00"};
		got = AmudancaContinua.salutationTime(95.5);
    assertArrayEquals(want, got);
		//Test 3
		want = new String[] {"Boa Noite!!","18","30","00"};
		got = AmudancaContinua.salutationTime(187.5);
    assertArrayEquals(want, got);
		//Test 4
		want = new String[] {"De Madrugada!!","00","38","00"};
		got = AmudancaContinua.salutationTime(279.5);
		assertArrayEquals(want, got);
	}

}
