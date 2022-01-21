<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+moonFase(2,4);

define("NOVA", "nova");
define("CRESCENTE", "crescente");
define("CHEIA", "cheia");
define("MINGUANTE", "minguante");

class FasesDaLua {

    /**
     * Check the fase of the Moon.
     */
    public function moonFase($day1, $day2) {
        $result = CHEIA;

        if ($day1 >= 0 && $day2 <= 2) {
            $result = NOVA;
        } else if ($day2 > $day1 && $day2 <= 96) {
            $result = CRESCENTE;
        } else if ($day1 >= $day2 && $day2 <= 96) {
            $result = MINGUANTE;
        } 

        return $result;
    }

}
