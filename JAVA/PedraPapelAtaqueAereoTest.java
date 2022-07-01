/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PedraPapelAtaqueAereoTest {

	@Test
	public void testPedraPapelAtaqueAereo() throws Exception {
        //Test 1
        String want = "Sem ganhador";
        String got = PedraPapelAtaqueAereo.jokenpoWinner("pedra", "pedra");
        assertEquals(want, got);
        //Test 2
        want = "Jogador 1 venceu";
        got = PedraPapelAtaqueAereo.jokenpoWinner("ataque", "papel");
        assertEquals(want, got);
        //Test 3
        want = "Jogador 1 venceu";
        got = PedraPapelAtaqueAereo.jokenpoWinner("Ataque", "Pedra");
        assertEquals(want, got);
        //Test 4
        want = "Jogador 2 venceu";
        got = PedraPapelAtaqueAereo.jokenpoWinner("Pedra", "Ataque");
        assertEquals(want, got);
        //Test 5
        want = "Jogador 1 venceu";
        got = PedraPapelAtaqueAereo.jokenpoWinner("Pedra", "Papel");
        assertEquals(want, got);
        //Test 6
        want = "Jogador 2 venceu";
        got = PedraPapelAtaqueAereo.jokenpoWinner("Papel", "Pedra");
        assertEquals(want, got);
        //Test 7
        want = "Jogador 1 venceu";
        got = PedraPapelAtaqueAereo.jokenpoWinner("Ataque", "Papel");
        assertEquals(want, got);
        //Test 8
        want = "Jogador 2 venceu";
        got = PedraPapelAtaqueAereo.jokenpoWinner("Papel", "Ataque");
        assertEquals(want, got);
        //Test 9
        want = "Ambos venceram";
        got = PedraPapelAtaqueAereo.jokenpoWinner("Papel", "Papel");
        assertEquals(want, got);
        //Test 10
        want = "Sem ganhador";
        got = PedraPapelAtaqueAereo.jokenpoWinner("Pedra", "Pedra");
        assertEquals(want, got);
        //Test 11
        want = "Aniquilacao mutua";
        got = PedraPapelAtaqueAereo.jokenpoWinner("Ataque", "Ataque");
        assertEquals(want, got);
	}

}
