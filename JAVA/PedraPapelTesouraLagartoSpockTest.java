/** 
 * @version JAVA 1.8
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PedraPapelTesouraLagartoSpockTest {

	@Test
	public void testPedraPapelTesouraLagartoSpock() throws Exception {
        //Test 1
        String want = "empate";
        String got = PedraPapelTesouraLagartoSpock.jokenpoSpock("spock", "spock");
        assertEquals(want, got);
        //Test 2
        want = "Marcia";
        got = PedraPapelTesouraLagartoSpock.jokenpoSpock("tesoura", "spock");
        assertEquals(want, got);
        //Test 3
        want = "Fernanda";
        got = PedraPapelTesouraLagartoSpock.jokenpoSpock("lagarto", "spock");
        assertEquals(want, got);
	}

}
