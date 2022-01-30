/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MensagemDoPadreDoBalaoTest {

	@Test
	public void testMensagemDoPadreDoBalao() throws Exception {
		//Test 1
		String want = "HELP";
		String got = MensagemDoPadreDoBalao.decodeMsg("ABCDEFGHIJKLMNOPQRSTUVWXYZ", new int[] {8, 5, 12, 16});
		assertEquals(want, got);
		//Test 2
		want = "HELLOWORLD";
		got = MensagemDoPadreDoBalao.decodeMsg("QWERTYUIOPASDFGHJKLZXCVBNM", new int[] {16, 3, 19, 19, 9, 2, 9, 4, 19, 13});
		assertEquals(want, got);
		//Test 3
		want = "PROGRAMMER";
		got = MensagemDoPadreDoBalao.decodeMsg("ABCDEFGHIJKLMNOPQRSTUVWXYZ", new int[] {16, 18, 15, 7, 18, 1, 13, 13, 5, 18});
		assertEquals(want, got);
	}

}
