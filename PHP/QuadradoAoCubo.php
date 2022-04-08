<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+loadSquareAndCumbe( 6 );

class QuadradoAoCubo {

    /**
     * Load all square and cumbe numbers.
     */
    public function loadSquareAndCumbe($n = 0) {
        $results = array();

        for ( $i=1; $i <= $n; $i++ ) {
            array_push( $results, [$i, pow($i, 2), pow($i, 3)] );
        }
        
        return $results;
    }

}
