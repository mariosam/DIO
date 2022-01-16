/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class FusoHorario {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int horasaida = sc.nextInt();
      int tempoviagem = sc.nextInt();
      int fuso = sc.nextInt();
      sc.close();

      System.out.println( localTime(horasaida, tempoviagem, fuso) );
    }

    /**
     * Calculate time and timezone to inform the localtime/gap of travel.
     */
    public static int localTime(int S, int T, int F) {
        int adj = S + T + F;

        if (adj >= 24) { adj -= 24; } 
        else if (adj < 0) { adj += 24; }

        return adj;
    }
}
