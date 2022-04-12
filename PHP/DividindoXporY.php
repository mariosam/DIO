<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

define("IMPOSSIVEL", "divisao impossivel");

//echo "The result is "+divTwoValues(8,8);

class DividindoXporY {

    /**
     * Do the math: DIV two values.
     */
    public function divTwoValues($x = 0, $y = 0) {
        $result = IMPOSSIVEL;

        if ( $y != 0 ) $result = round(($x / $y), 1);
    
        return $result;
    }

}
