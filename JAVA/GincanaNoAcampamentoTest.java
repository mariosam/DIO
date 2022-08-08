/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GincanaNoAcampamentoTest  {

	@Test
	public void testGincanaNoAcampamento() throws Exception {
		//Test 1
		String want = "Fernanda";
        String[][] ops = {{"Fernanda", "7"}, {"Fernando", "9"}, {"Gustavo", "11"}};
		String got = GincanaNoAcampamento.winnerOfScavengerGame( ops );
		assertEquals(want, got);
		//Test 2
		want = "Pedro";
        ops = new String[][] {{"Maria", "7"}, {"Pedro", "9"}, {"Joao_Vitor", "5"}, {"Isabel", "12"}, {"Laura", "8"}};
		got = GincanaNoAcampamento.winnerOfScavengerGame( ops );
		assertEquals(want, got);
		//Test 3
		want = "Pedro";
        ops = new String[][] {{"Maria", "4"}, {"Pedro", "3"}, {"Joao", "2"}};
		got = GincanaNoAcampamento.winnerOfScavengerGame( ops );
		assertEquals(want, got);
	}

}
