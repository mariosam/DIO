/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FilaDoBanco {
	
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int numbers = sc.nextInt();
            String[] temp = sc.nextLine().split(" ");

            Integer[] senhas = new Integer[numbers];
            for (int j = 0; j < numbers; j++) {
                senhas[j] = Integer.parseInt(temp[j]);
            }

            System.out.println( changingPlaces(senhas) );
        }
        sc.close();
	}

    /**
     * Count how many changes need to right the queue.
     */
    public static int changingPlaces(Integer[] ar) {
        //faz uma copia do array
        ArrayList<Integer> pwdOrder = new ArrayList<>(Arrays.asList(ar));
        Collections.sort(pwdOrder);
        //inverte a ordem do array
        Collections.reverse(pwdOrder);

        int result = 0;
        //verifica se alguem precisa trocar de lugar na fila
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == pwdOrder.get(i)) result++;
        }

        return result;
    }
}
