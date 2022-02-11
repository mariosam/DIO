/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import org.junit.Assert;
import org.junit.Test;

public class AmudancaTest {

	@Test
	public void testAmudanca() throws Exception {
		//Test 1
		String want = "Bom Dia!!";
		String got = Amudanca.salutation(0);
        Assert.assertEquals(want, got);
		//Test 2
		want = "Bom Dia!!";
		got = Amudanca.salutation(45);
        Assert.assertEquals(want, got);
		//Test 3
		want = "Bom Dia!!";
		got = Amudanca.salutation(360);
        Assert.assertEquals(want, got);
		//Test 4
		want = "Boa Tarde!!";
		got = Amudanca.salutation(90);
		Assert.assertEquals(want, got);
		//Test 5
		want = "Boa Noite!!";
		got = Amudanca.salutation(180);
		Assert.assertEquals(want, got);
	}

}
