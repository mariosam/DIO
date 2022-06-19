/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DeQuemEaVezTest  {

	@Test
	public void testDeQuemEaVez() throws Exception {
		//Test 1
		String want = "Quico";
        String[] ops = {"Quico", "PAR", "Chiquinha", "IMPAR", "9", "7"};
		String got = DeQuemEaVez.evenOrOdd( ops );
		assertEquals(want, got);
		//Test 2
		want = "Marcus";
        ops = new String[] {"Dami", "PAR", "Marcus", "IMPAR", "12", "3"};
		got = DeQuemEaVez.evenOrOdd( ops );
		assertEquals(want, got);
		//Test 3
		want = "Conrado";
        ops = new String[] {"Dayran", "PAR", "Conrado", "IMPAR", "3", "1000000000"};
		got = DeQuemEaVez.evenOrOdd( ops );
		assertEquals(want, got);
		//Test 4
		want = "Chaves";
        ops = new String[] {"Popis", "PAR", "Chaves", "IMPAR", "2", "7"};
		got = DeQuemEaVez.evenOrOdd( ops );
		assertEquals(want, got);
	}

}
