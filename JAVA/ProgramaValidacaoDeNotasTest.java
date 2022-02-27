/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ProgramaValidacaoDeNotasTest {

    @Test
	public void testProgramaValidacaoDeNotas() throws Exception {
        //Test 1
        String[] want = {"nota invalida","nota invalida","media = 6.75","novo calculo (1-sim 2-nao)","novo calculo (1-sim 2-nao)","media = 8.50","novo calculo (1-sim 2-nao)"};
        String[] ops = {"-3.5", "3.5", "11.0", "10.0", "4", "1", "8.0", "9.0", "2", "7.0"};
        String[] got = ProgramaValidacaoDeNotas.startSystem( ops );
        assertArrayEquals(want, got);
	}

}
