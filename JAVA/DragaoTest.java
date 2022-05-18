/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import org.junit.Assert;
import org.junit.Test;

public class DragaoTest {

	@Test
	public void testDragao() throws Exception {
		//Test 1
		String want = "Mais de 8000!";
		String got = Dragao.checkEnergyLevel(8001);
        Assert.assertEquals(want, got);
		//Test 2
		want = "Inseto!";
		got = Dragao.checkEnergyLevel(100);
        Assert.assertEquals(want, got);
		//Test 3
		want = "Inseto!";
		got = Dragao.checkEnergyLevel(200);
        Assert.assertEquals(want, got);
	}

}
