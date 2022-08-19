/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ValidadorDeSenhasComRequisitosTest {

	@Test
	public void testValidadorDeSenhasComRequisitos() throws Exception {
        //Test 1
        String want = "Senha invalida.";
        String got = ValidadorDeSenhasComRequisitos.passwordValidator("Digital Innovation One");
        assertEquals(want, got);
        //Test 2
        want = "Senha valida.";
        got = ValidadorDeSenhasComRequisitos.passwordValidator("AbcdEfgh99");
        assertEquals(want, got);
        //Test 3
        want = "Senha valida.";
        got = ValidadorDeSenhasComRequisitos.passwordValidator("DigitalInnovationOne123");
        assertEquals(want, got);
        //Test 4
        want = "Senha invalida.";
        got = ValidadorDeSenhasComRequisitos.passwordValidator("Digital Innovation One 123");
        assertEquals(want, got);
        //Test 5
        want = "Senha invalida.";
        got = ValidadorDeSenhasComRequisitos.passwordValidator("Aass9");
        assertEquals(want, got);
        //Test 6
        want = "Senha valida.";
        got = ValidadorDeSenhasComRequisitos.passwordValidator("Aassd9");
        assertEquals(want, got);
        //Test 7
        want = "Senha invalida.";
        got = ValidadorDeSenhasComRequisitos.passwordValidator("Aa@ssd9!");
        assertEquals(want, got);
        //Test 8
        want = "Senha invalida.";
        got = ValidadorDeSenhasComRequisitos.passwordValidator("DIO123456");
        assertEquals(want, got);
        //Test 9
        want = "Senha valida.";
        got = ValidadorDeSenhasComRequisitos.passwordValidator("Ano2020");
        assertEquals(want, got);
        //Test 10
        want = "Senha invalida.";
        got = ValidadorDeSenhasComRequisitos.passwordValidator("Digita!123");
        assertEquals(want, got);
	}

}
