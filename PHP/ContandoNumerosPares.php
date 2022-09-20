<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+countEven(4);

class ContandoNumerosPares {

    /**
     * Get a number and sum all even digits. 
     */
    public function countEven($num = 0): int {
        $count = 0;

        for ( $i=1; $i <= $num; $i++ ) {
            //controle para 1 digito
            if ( strlen( $i ) == 1 ) {
                //se for par
                if ($i%2 == 0) $count++;
                continue;
            }
            
            //controle para multiplos digitos
            $multi = str_split($i);
            $sum = 0;
            for ( $x=0; $x < sizeof($multi); $x++ ) {
                $sum += $multi[$x];
            }

            //se for par
            if ($sum%2 == 0) $count++;
        }

        return $count;
    }

}
