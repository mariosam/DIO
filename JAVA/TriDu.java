/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class TriDu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String[] line = sc.nextLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        sc.close();

        System.out.println(greatestCard(a, b));
	}

    /**
     * Check what it is the greatest card.
     */
    public static int greatestCard(int A, int B) {
        int result = A;

        if (A < B) {
            result = B;
        }

        return result;
    }
}
