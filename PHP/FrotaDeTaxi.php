<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+moreEconomic(1.20, 2.30, 10.00, 15.00);

class FrotaDeTaxi {

    /**
     * Return the more economic combustivel.
     */
    public function moreEconomic($a, $g, $ra, $rg) {
        $result = "A";
        $precoPorKmAlcool = $a / $ra;
        $precoPorKmGasolina = $g / $rg;

        if ( $precoPorKmGasolina <= $precoPorKmAlcool ) $result = "G";

        return $result;
    }

}
