<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+countEve( 6 );

class ExibindoNumerosPares {

    /**
     * Show only the eve numbers.
     */
    public function countEve($n = 0) {
        $results = array();

        for ( $i=2; $i <= $n; $i+=2 ) array_push( $results, $i );
        
        return $results;
    }

}
