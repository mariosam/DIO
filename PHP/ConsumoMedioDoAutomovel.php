<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+averageConsumption(500, 35.0);

class ConsumoMedioDoAutomovel {

    /**
     * Calculate and return the high of object.
     */
    public function averageConsumption($x = 0, $y = 0.0) {
        $res = $x / $y;

        return round($res, 3);
    }

}
