<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+simpleFactorial(4);

class FatorialSimples {

    /**
     * Return the factorial number.
     */
    public function simpleFactorial($N): int {
        $result = 1;
        $N++;

        while ( $N > 1 ) {
            $result = $result * ($N-1); 
            $N--;
        } 

        return $result;
    }

}
