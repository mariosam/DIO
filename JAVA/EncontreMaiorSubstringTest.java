/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EncontreMaiorSubstringTest {

    @Test
	public void testEncontreMaiorSubstring() throws Exception {
		//Test 1
		int want = 2;
		int got = EncontreMaiorSubstring.findTheBiggestSubstring("abcdef", "cdofhij");
		assertEquals(want, got);
		//Test 2
		want = 1;
		got = EncontreMaiorSubstring.findTheBiggestSubstring("TWO", "FOUR");
		assertEquals(want, got);
		//Test 3
		want = 0;
		got = EncontreMaiorSubstring.findTheBiggestSubstring("abracadabra", "open");
		assertEquals(want, got);
		//Test 4
		want = 7;
		got = EncontreMaiorSubstring.findTheBiggestSubstring("Hey This java is hot", "Java is a new paradigm");
		assertEquals(want, got);
	}
}
