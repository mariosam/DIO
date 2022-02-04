/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TempoDoDobbyTest {

	@Test
	public void testTempoDoDobby() throws Exception {
		//Test 1
		String want = "Deixa para amanha!";
		String got = TempoDoDobby.todayOrTomorrow(20, 15, 6);
		assertEquals(want, got);
		//Test 2
		want = "Farei hoje!";
		got = TempoDoDobby.todayOrTomorrow(20, 10, 10);
		assertEquals(want, got);
	}

}
