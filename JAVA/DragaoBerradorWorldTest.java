/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DragaoBerradorWorldTest {

	@Test
	public void testDragaoBerradorWorld() throws Exception {
		//Test 1
		int want = 5;
		int got = DragaoBerradorWorld.numberOfGuests(new int[]{8, 160, 182}, new int[]{160, 182, 183, 159, 250, 170, 172, 173});
		assertEquals(want, got);
		//Test 2
		want = 2;
		got = DragaoBerradorWorld.numberOfGuests(new int[]{5, 155, 176}, new int[]{149, 154, 172, 182, 167});
		assertEquals(want, got);
	}

}
