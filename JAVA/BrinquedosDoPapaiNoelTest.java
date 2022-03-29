/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class BrinquedosDoPapaiNoelTest {

	@Test
	public void testBrinquedosDoPapaiNoel() throws Exception {
		//Test 1
		int[] want = {2, 3};
		int[] got = BrinquedosDoPapaiNoel.howManyToys( new String[] {"Milena F", "Joao M", "Rafaela F", "Renata F", "Felipe M"} );
        assertArrayEquals(want, got);
	}

}
