/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import org.junit.Test;

public class Saida1Test {

	@Test
	public void testSaida1() throws Exception {
        Saida1.printBox("-", "-");
		    Saida1.printBox("|", " ");
        Saida1.printBox("-", "-");
	}

}
