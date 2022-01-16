<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+localTime(10, 7, 3);

class FusoHorario {

    /**
     * Calculate time and timezone to inform the localtime/gap of travel.
     */
    public function localTime($S, $T, $F): int {
        $adj = $S + $T + $F;

        if ($adj >= 24) { $adj -= 24; } 
        else if ($adj < 0) { $adj += 24; }

        return $adj;
    }

}
