<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+checkSequence("Fulano de Tal");

define("YES", "YES");
define("NO", "NO");

class NomeNoFormulario {

    /**
     * Check if the size of name is valid.
     */
    public function checkNameSize($name) {
        $result = NO;

        if ( strlen(trim($name)) < 81 ) $result = YES;

        return $result;
    }

}
