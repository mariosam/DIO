/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SenhaFixaTest {

	@Test
	public void testSenhaFixa() throws Exception {
		//Test 1
		String want = "Senha Invalida";
		String got = SenhaFixa.checkPass(2200);
		assertEquals(want, got);
		//Test 2
		want = "Senha Invalida";
		got = SenhaFixa.checkPass(1020);
		assertEquals(want, got);
		//Test 3
		want = "Senha Invalida";
		got = SenhaFixa.checkPass(2022);
		assertEquals(want, got);
		//Test 3
		want = "Acesso Permitido";
		got = SenhaFixa.checkPass(2002);
		assertEquals(want, got);
	}

}
