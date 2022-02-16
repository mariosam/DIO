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

//echo "The result is "+salutationTime( 128.5 );

class AmudancaContinua {

    /**
     * Return the best salutation and timezone based on sun time.
     */
    public function salutationTime($graus) {
        $salut = MADRU;

        if ( $graus == 360 || $graus >= 0 && $graus < 90 ) $salut = DIA;
        else if ( $graus >= 90 && $graus < 180 ) $salut = TARDE;
        else if ( $graus >= 180 && $graus < 270 ) $salut = NOITE;

        $hour = (($graus * 4.0) / 60.0) + 6.0;
        if ( $graus >= 270 ) $hour = (($graus - 270.0) * 4.0) / 60.0;

        $min = ($hour * 60.0) % 60.0;
	      $sec = ($min * 60.0) % 60.0;

        if ( $sec > 59 ) {
            $sec = 0.0;
            $min += 1.0;
        }

        //format output
        $hour = sprintf("%02d", $hour);
        $min = sprintf("%02d", $min);
        $sec = sprintf("%02d", $sec);

        return [ $salut, $hour, $min, $sec ];
    }

}
