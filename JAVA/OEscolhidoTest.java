/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class OEscolhidoTest {

	@Test
	public void testOEscolhido() throws Exception {
		//Test 1
		String want = "1001";
        List<String> ops = Arrays.asList( "1000 5", "1001 10", "1002 6" );
		String got = OEscolhido.checkingHighestNote( ops );
        assertEquals(want, got);
		//Test 2
        want = "Minimum note not reached";
		ops = Arrays.asList ( "900775 5.7", "201553 7.9", "5032 6.2", "2088 2.1" );
		got = OEscolhido.checkingHighestNote( ops );
        assertEquals(want, got);
	}

}
