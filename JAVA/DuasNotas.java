/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class DuasNotas {

    private final static String POSSIVEL = "possible";
    private final static String IMPOSSIVEL = "impossible";
    private final static int[] NOTAS = {2, 5, 10, 20, 50, 100};

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );

        while (sc.hasNext()) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if (n1 != 0 && n2 != 0) {
                System.out.println(hasTwoNotesChange(n1, n2));
            }
        }
        sc.close();
	}

    /**
     * Check if is possible (or impossible) to give two notes change.
     */
    public static String hasTwoNotesChange(int x, int y) {
        String result = IMPOSSIVEL;
        int change = y - x;

        for (int i = 0; i < NOTAS.length; i++) {
            for (int j = 0; j < NOTAS.length; j++) {
                if (change == NOTAS[i] + NOTAS[j]) {
                    result = POSSIVEL;
                    break;
                }
            }
        }

        return result;
    }
}
