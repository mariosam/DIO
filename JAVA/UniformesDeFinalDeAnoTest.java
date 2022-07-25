/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class UniformesDeFinalDeAnoTest {

	@Test
	public void testUniformesDeFinalDeAno() throws Exception {
		//Test 1
		String[] want = {"branco P Maria Joao","branco P Maria Jose","vermelho P Marcio Guess"};
		String[] got = UniformesDeFinalDeAno.uniformsInOrder( new String[] {"Maria Joao","branco P","Marcio Guess","vermelho P","Maria Jose","branco P"} );
        assertArrayEquals(want, got);
		//Test 2
		want = new String[] {"branco P Cezar Torres Mo","branco P Maria Jose","branco M JuJu Mentina","branco G Adabi Finho","branco G Severina Rigudinha","vermelho P Amaro Dinha","vermelho P Baka Lhau","vermelho P Carlos Chade Losna","vermelho P Mangojata Mancuda"};
		got = UniformesDeFinalDeAno.uniformsInOrder( new String[] {"Maria Jose","branco P","Mangojata Mancuda","vermelho P","Cezar Torres Mo","branco P","Baka Lhau","vermelho P","JuJu Mentina","branco M","Amaro Dinha","vermelho P","Adabi Finho","branco G","Severina Rigudinha","branco G","Carlos Chade Losna","vermelho P"} );
        assertArrayEquals(want, got);
	}

}
