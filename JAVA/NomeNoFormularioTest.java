/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NomeNoFormularioTest {

	@Test
	public void testNomeNoFormulario() throws Exception {
		//Test 1
		String want = "YES";
		String got = NomeNoFormulario.checkNameSize("Fulano de Tal");
		assertEquals(want, got);
		//Test 2
		want = "NO";
		got = NomeNoFormulario.checkNameSize("Pedro de Alcantara Francisco Antonio Joao Carlos Xavier de Paula Miguel Rafael Joaquim Jose Gonzaga Pascoal Cipriano Serafim");
		assertEquals(want, got);
	}

}
