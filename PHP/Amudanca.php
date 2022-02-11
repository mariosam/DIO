<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

define("DIA", "Bom Dia!!");
define("TARDE", "Boa Tarde!!");
define("NOITE", "Boa Noite!!");
define("MADRU", "De Madrugada!!");

//echo "The result is "+salutation(12);

class Amudanca {

    /**
     * Return the best salutation based on sun time.
     */
    public function salutation($graus) {
        $result = MADRU;

        if ( $graus == 360 || $graus >= 0 && $graus < 90 ) $result = DIA;
        else if ( $graus >= 90 && $graus < 180 ) $result = TARDE;
        else if ( $graus >= 180 && $graus < 270 ) $result = NOITE;

        return $result;
    }

}
