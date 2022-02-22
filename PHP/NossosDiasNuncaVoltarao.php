<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+cutWord(2);

define("WORD", "LIFE IS NOT A PROBLEM TO BE SOLVED");

class NossosDiasNuncaVoltarao {

    /**
     * Identify the range of position.
     */
    public function cutWord($pos) {
        return substr(WORD, 0, $pos);
    }

}
