<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+numberAnalysis([-5, 0, -3, -4, 12]);

class AnaliseDeNumeros {

    /**
     * Count number of positives negatives odd and even.
     */
    public function numberAnalysis($nums) {
        $pos = 0; $neg = 0; $odd = 0; $eve = 0;

        for ( $i=0; $i < sizeof($nums); $i++ ) {
            $n = $nums[$i];

            //check if odd or even
            if ( $n % 2 == 0 ) {
        	    $eve++;
            } else {
                $odd++;
            }
            
            //check if positive or negative
            if ( $n != 0 ) {
                if ( $n > 0 ) {
                    $pos++;
                } else {
                    $neg++;
                }
            }
        }

        return [ $eve, $odd, $pos, $neg ];
    }
}
