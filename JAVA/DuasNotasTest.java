/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import org.junit.Assert;
import org.junit.Test;

public class DuasNotasTest {

	@Test
	public void testDuasNotas() throws Exception {
		//Test 1
		String want = "possible";
		String got = DuasNotas.hasTwoNotesChange(11, 23);
        Assert.assertEquals(want, got);
		//Test 2
		want = "possible";
		got = DuasNotas.hasTwoNotesChange(500, 650);
		Assert.assertEquals(want, got);
		//Test 3
		want = "impossible";
		got = DuasNotas.hasTwoNotesChange(100, 600);
		Assert.assertEquals(want, got);
		//Test 4
		want = "possible";
		got = DuasNotas.hasTwoNotesChange(9948, 9963);
		Assert.assertEquals(want, got);
		//Test 5
		want = "impossible";
		got = DuasNotas.hasTwoNotesChange(1, 2);
		Assert.assertEquals(want, got);
		//Test 6
		want = "impossible";
		got = DuasNotas.hasTwoNotesChange(2, 4);
		Assert.assertEquals(want, got);
	}

}
