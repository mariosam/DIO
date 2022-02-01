/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Tomadas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int t4 = sc.nextInt();
        sc.close();

        System.out.println( maxDevices(t1, t2, t3, t4) );
    }

    /**
     * Calculate the number max of devices can be pluged.
     */
    public static int maxDevices(int t1, int t2, int t3, int t4) {
        return (t1 + t2 + t3 + t4) - 3;
    }
}
