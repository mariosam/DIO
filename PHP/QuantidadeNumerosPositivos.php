<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+sumPositives([4, 4, 6, 2]);

class QuantidadeNumerosPositivos {

    /**
     * Count positives numbers.
     */
    public function sumPositives($ar): int {
        $result = 0;

        foreach ( $ar as $num ) {
            if ( $num > 0 ) $result++;
        }

        return $result;
    }

}
