<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+orderWordsBySize("Fulano de Tal");

class OrdenacaoDePalavrasPorTamanho {

    /**
     * Return the words ordered by size (desc).
     */
    public function orderWordsBySize($words = "") {
        $words = explode(" ", $words);
        
        usort($words, function($a, $b) {
            return strlen($b) - strlen($a);
        });

        return implode(" ", $words);
    }

}
