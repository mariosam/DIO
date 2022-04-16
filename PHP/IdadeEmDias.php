<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+splitAgeDays( 6 );

class IdadeEmDias {

    /**
     * Split age in days, month and year
     */
    public function splitAgeDays($days = 0) {
        $year = floor($days / 365);
        $month = floor(($days % 365) / 30);
        $day = $days % 365 % 30;

        return [$year, $month, $day];
    }

}
