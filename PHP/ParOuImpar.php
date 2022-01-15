<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+typeNumberMsg(-5);

class ParOuImpar {

    /**
     * Check if number is positive negative even and/or odd
     */
    public function typeNumberMsg($x) {
        $result = "NULL";

        if ( $x != 0 ) {
            //even or odd?
            if ( $x%2 == 0 ) {
                $result = "EVEN ";
            } else {
                $result = "ODD ";
            }
            //positive or negative?
            if ( $x > 0 ) {
                $result .= "POSITIVE";
            } else {
                $result .= "NEGATIVE";
            }
        }
    
        return $result;
    }

}
