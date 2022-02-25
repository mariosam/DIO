<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+checkSequence(5, 6, 7, 8);

define("SIM", "Valores aceitos");
define("NAO", "Valores nao aceitos");

class TesteDeSelecao1 {

    /**
     * Check if order of numbers are valid.
     */
    public function checkSequence($a, $b, $c, $d) {
        $result = NAO;

        if ($b > $c && $d > $a && $c > 0 && $d > 0 && ($c + $d) > ($a + $b) && $a % 2 == 0) $result = SIM;

        return $result;
    }

}
