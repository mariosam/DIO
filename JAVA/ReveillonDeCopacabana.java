/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class ReveillonDeCopacabana {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();

        while (n != 0) {
            for (int i = 0; i < n; i++) {
                int people = sc.nextInt();

                System.out.println( howManyOrdersPerPeople(people) );
            }
            n = sc.nextInt();
        }
		sc.close();
	}

    /**
     * Cont how many orders will be delivered per people.
     */
    public static int howManyOrdersPerPeople(int people) {
        int result = 0;

        if ( people % 2 != 0 ) {
            result = ( people * 2 ) - 1;
        } else {
            result = ( people * 2 ) - 2;
        }

        return result;
    }
}
