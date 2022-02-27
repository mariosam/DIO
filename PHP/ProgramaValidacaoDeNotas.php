<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

define("NOTAINVALIDA", "nota invalida");
define("MEDIA", "media = ");
define("NOVOCALCULO", "novo calculo (1-sim 2-nao)");

//echo "The result is "+startSystem([-3.5, 3.5, 11.0, 10.0, 4, 1, 8.0, 9.0, 2, 7.0]);

class ProgramaValidacaoDeNotas {

    //globais (!)
    static $n1 = -1; 
    static $n2 = -1;
    static $arr = array();

    /**
     * Control the calls to the systems checks.
     */
    public function startSystem($nums) {
        for ( $i=0; $i < count($nums); $i++ ) {
            if ( $this->checkNumber( $nums[$i] ) == 0 ) {
                if ( $nums[$i] == 2 || $nums[$i] == "" ) break;
    
                if ( $this->checkSystem( $nums[$i] ) == false ) {
                    $arr[] = NOVOCALCULO;
                    continue;
                }
                $i++;
            }
            $this->scoreValidate( $nums[$i] );
        }
    
        return $arr;
    }

    /**
     * Check if is a valida score to sum.
     */
    function checkNumber($num) {
        return strpos($num, '.');
    }
    
    /**
     * Check if must continue or stop.
     */
    function checkSystem($num) {
        return $num == 1 ? true : false;
    }

    /**
     * Check the entry and do the math to score.
     */
    function scoreValidate($num) {
        global $n1, $n2;

        if ( $num >= 0 && $num <= 10 ) {
            $n1 > -1 ? $n2 = $num : $n1 = $num;
    
            if ( $n2 > -1 ) {
                $average = (($n1+$n2) / 2);
    
                $arr[] = MEDIA.$average;
                $arr[] = NOVOCALCULO;
    
                $n1 = -1; $n2 = -1;
            }
        } else {
            $arr[] = NOTAINVALIDA;
        }
    }
}
