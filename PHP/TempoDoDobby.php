<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+todayOrTomorrow(22);

define("HOJE", "Farei hoje!");
define("AMANHA", "Deixa para amanha!");

class TempoDoDobby {

    /**
     * Dobby will do the work today or tomorrow.
     */
    public function todayOrTomorrow($n, $a, $b) {
        $result = HOJE;

        if ( $n < ($a+$b) ) $result = AMANHA;

        return $result;
    }

}
