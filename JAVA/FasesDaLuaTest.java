/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FasesDaLuaTest {

	@Test
	public void testFasesDaLua() throws Exception {
		//Test 1
		String want = "nova";
		String got = FasesDaLua.moonFase(0, 2);
		assertEquals(want, got);
		//Test 2
		want = "crescente";
		got = FasesDaLua.moonFase(2, 3);
		assertEquals(want, got);
		//Test 3
		want = "cheia";
		got = FasesDaLua.moonFase(99, 97);
		assertEquals(want, got);
		//Test 4
		want = "minguante";
		got = FasesDaLua.moonFase(97, 94);
		assertEquals(want, got);
		//Test 5
		want = "crescente";
		got = FasesDaLua.moonFase(30, 35);
		assertEquals(want, got);
	}

}
