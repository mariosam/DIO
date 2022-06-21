<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

define("IMPOSSIVEL", "impossible");
define("POSSIVEL", "possible");
define("NOTAS", [2, 5, 10, 20, 50, 100]);

//echo "The result is "+hasTwoNotesChange(11, 23);

class DuasNotas {

    /**
     * Check if is possible (or impossible) to give two notes change.
     */
    public function hasTwoNotesChange($x = 0, $y = 0) {
        $result = IMPOSSIVEL;
        $change = $y - $x;

        for ($i = 0; $i < count(NOTAS); $i++) {
            for ($j = 0; $j < count(NOTAS); $j++) {
                if (NOTAS[$i] + NOTAS[$j] == $change) {
                    $result = POSSIVEL;
                    break;
                }
            }
        }
    
        return $result;
    }

}
