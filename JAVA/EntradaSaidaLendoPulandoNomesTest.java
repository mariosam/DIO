/** 
 * @version JAVA 1.8
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class EntradaSaidaLendoPulandoNomesTest {

	@Test
	public void testEntradaSaidaLendoPulandoNomes() throws Exception {
		//Test 1
		String[] want = {"UFCG", "ITA", "URI"};
		String[] got = EntradaSaidaLendoPulandoNomes.giveMe379( new String[]{"USP","UFPE","UFCG","UFRN","UFRJ","IME","ITA","UNIOESTE","URI","UFG"} );
        assertArrayEquals(want, got);
		//Test 2
		want = new String[] {"UNIFEI","UFRGS","UFU"};
		got = EntradaSaidaLendoPulandoNomes.giveMe379( new String[]{"UnB","UFMG","UNIFEI","UECE","UNICAMP","INATEL","UFRGS","UNIFESO","UFU","PUC"} );
        assertArrayEquals(want, got);
	}

}
