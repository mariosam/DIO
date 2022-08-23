/**
 * @version JAVA 1.8
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class PedraPapelTesouraLagartoSpock {

    private final static String EMPATE = "empate";
    private final static String MARCIA = "Marcia";
    private final static String FERNANDA = "Fernanda";

    private final static Map<String, String[]> dicionario = Map.of(
            "pedra", new String[]{"tesoura", "lagarto"},
            "papel", new String[]{"pedra", "spock"},
            "tesoura", new String[]{"papel", "lagarto"},
            "lagarto", new String[]{"pedra", "spock"},
            "spock", new String[]{"papel", "tesoura"}
    );

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();

        for ( int i=0; i < N; i++ ) {
            String[] jogadas = sc.nextLine().split(" ");

            System.out.println( jokenpoSpock( jogadas[0], jogadas[1] ) );
        }
        sc.close();
	}

    /**
     * Check who is the winner of the game Jokenpo Spock.
     */
    public static String jokenpoSpock(String p1, String p2) {
        String result = EMPATE;

        if ( Arrays.asList(dicionario.get(p1)).contains(p2) ) {
            result = FERNANDA;
        } else if ( Arrays.asList(dicionario.get(p2)).contains(p1) ) {
            result = MARCIA;
        }

        return result;
    }
}
