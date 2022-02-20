/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ComprasNoSupermercadoTest {

    @Test
	public void testComprasNoSupermercado() throws Exception {
        //Test 1
        String[] want = {"carne", "laranja", "picles", "suco"};
        List<String> ops = Arrays.asList( "carne", "laranja", "suco", "picles", "laranja", "picles" );
        String[] got = ComprasNoSupermercado.checkMyList( ops );
        assertArrayEquals(want, got);
        //Test 1
        want = new String[] {"laranja", "pera"};
        ops = Arrays.asList( "laranja", "pera", "laranja", "pera", "pera" );
        got = ComprasNoSupermercado.checkMyList( ops );
        assertArrayEquals(want, got);
	}

}
