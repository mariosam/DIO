/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FolhaDePagamentoTest  {

	@Test
	public void testFolhaDePagamento() throws Exception {
		//Test 1
		double want = 550.00;
		double got = FolhaDePagamento.calcSalary(100, 5.50);
		assertEquals(want, got, 0.01);
		//Test 2
		want = 4100.00;
		got = FolhaDePagamento.calcSalary(200, 20.50);
		assertEquals(want, got, 0.01);
		//Test 3
		want = 2254.75;
		got = FolhaDePagamento.calcSalary(145, 15.55);
		assertEquals(want, got, 0.01);
	}

}
