/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Lanche {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        sc.close();
        
        System.out.printf("Total: R$ %.2f\n", totalToPay(cod, qtd));
	  }

    /**
     * Sum total to pay.
     */
    public static float totalToPay(int cod, int qtd) {
        float result = 0;

        switch (cod) {
            case 1:
                result = qtd * (float) 4.00;
                break;
            case 2:
                result = qtd * (float) 4.50;
                break;
            case 3:
                result = qtd * (float) 5.00;
                break;
            case 4:
                result = qtd * (float) 2.00;
                break;
            case 5:
                result = qtd * (float) 1.50;
                break;
        }

        return result;
    }
}
