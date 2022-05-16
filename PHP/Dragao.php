<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

define("MAISDE8000", "Mais de 8000!");
define("INSETO", "Inseto!");

//echo "The result is "+checkEnergyLevel(120);

class Dragao {

    /**
     * Return the drogon message about the energy level identified.
     */
    public function checkEnergyLevel( $energy = 0 ) {
        $result = INSETO;

        if ( $energy > 8000 ) $result = MAISDE8000;

        return $result;
    }

}
