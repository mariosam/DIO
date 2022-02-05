<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

define("SIM", "S");
define("NAO", "N");

//echo "The result is "+checkSize(25, 120, 220, 200, 100);

class Colchao {

    /**
     * Check if mattress pass through the door.
     */
    public function checkSize($A, $B, $C, $H, $L) {
        $result = NAO;

        if  (($A <= $H && $B <= $L) || ($A <= $H && $C <= $L) || ($B <= $H && $A <= $L) || ($B <= $H && $C <= $L) || ($C <= $H && $A <= $L) || ($C <= $H && $B <= $L)) 
            $result = SIM;

        return $result;
    }

}
