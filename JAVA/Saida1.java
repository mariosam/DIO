/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

public class Saida1 {
	
	  public static void main(String[] args) {
        printBox( "-", "-" );
        for ( int i=0; i < 5; i++ ) printBox( "|", " " );
        printBox( "-", "-" );
	  }

    /**
     * Print the sysmbols.
     */
    public static void printBox(String n1, String n2) {
    	  System.out.print( "\n"+n1 );
	      for ( int i=0; i < 37; i++ ) System.out.print( n2 );
	      System.out.print( n1+"\n") ;
    }
}
