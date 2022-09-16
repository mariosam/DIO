<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+reduceNumber(4);

class ReduzindoUmNumeroZero {

    /**
     * Get a number and reduce to zero.
     */
    public function reduceNumber($num = 0): int {
        $times = 0;

        while ( $num > 0 ) {
            $times++;

            //se for par
            if ( $num%2 == 0 ) {
                $num = $num/2; 
            } else {
                $num = $num-1;
            }
        }
    
        return $times;
    }

}
