<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+getHigh(3, 2);

define("PI",  3.14);

class ReservatorioDeMel {

    /**
     * Calculate and return the high of object.
     */
    public function getHigh($v, $d) {
        $f = $v / (PI * (($d / 2) * ($d / 2)));

        return round($f, 2);
    }

    /**
     * Calculate and return the area of object.
     */
    public function getArea($d) {
        $f = PI * (($d / 2) * ($d / 2));

        return floor($f*100) / 100;
    }

}
