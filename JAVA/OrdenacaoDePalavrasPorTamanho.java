/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoDePalavrasPorTamanho {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String word = sc.next();

            System.out.println( orderWordsBySize(word)) ;
        }
        sc.close();
	}

    /**
     * Return the words ordered by size (desc).
     */
    public static String orderWordsBySize(String words) {
        String[] wordsArray = words.split(" ");
        
        Arrays.sort(wordsArray, (w1, w2) -> w2.length() - w1.length());

        return String.join(" ", wordsArray);
    }
}
