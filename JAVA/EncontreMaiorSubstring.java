/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class EncontreMaiorSubstring {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String in1 = sc.next();
        while ( in1 != "" ) {
            System.out.println( findTheBiggestSubstring( in1, sc.nextLine() ) ); 
            in1 = sc.next();
        }
		sc.close();
	}

    /**
     * Compare two strings and return the biggest substring that is common to both words.
     */
    public static int findTheBiggestSubstring(String w1, String w2) {
        for (int size = w1.length(); size >= 0; size--) {
            for (int i = 0; i + size <= w1.length(); i++) {
                String sub = w1.substring(i, i + size);
    
                if (w2.indexOf(sub, 0) >= 0) return size;
            }
        }
    
        return 0;
    }
}
