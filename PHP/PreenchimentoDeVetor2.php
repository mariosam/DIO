<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+printAllVector2(3);

class PreenchimentoDeVetor2 {

    /**
     * Print all values of vector.
     */
    public function printAllVector2($x) {
        for ( $i=0, $j=0; $i < 1000; $i++, $j++ ) {
            echo "N[$i] = $j\n";
            
            if ( $j == ($x-1) ) $j = -1;
        }
    }

}
