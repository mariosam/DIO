<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+getDistance(1.0, 7.0, 5.0, 9.0);

class DistanciaEntreDoisPontos {

    /**
     * Do the math: Calculate the distance between two points.
     */
    public function getDistance($x1 = 0, $y1 = 0, $x2 = 0, $y2 = 0) {
        $x = $x2 - $x1;
        $y = $y2 - $y1;
        $distance = sqrt($x * $x + $y * $y);

        $casas = 6;
        if ( $distance > 100 ) {
            $casas = 8;
        } else if ( $distance > 10 ) {
            $casas = 7;
        }

        return substr(str_pad($distance, 4, '0', STR_PAD_LEFT),0, $casas);
    }
}
