<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+reportMinutes(4, 4);

class Distancia {

    /**
     * Calculate the minutes based on the distance and the speed.
     */
    public function reportMinutes($km = 0, $speed = 2) {
        return $km * $speed;
    }

}
