<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+printAllRest2(23);

class Resto2 {

    /**
     * Print all values where rest is equals 2.
     */
    public function printAllRest2($x) {
        for ( $i=1; $i < 10000; $i++ ) {
    		    if ( $i % $x == 2 ) echo "".$i."\n";
    	  }
    }

}
