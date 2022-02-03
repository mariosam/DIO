<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

define("NOTAS", [100, 50, 20, 10, 5, 2, 1]);

//echo "The result is "+countNotes( 11257 );

class ContagemDeCedulas {

    /**
     * Count the number of cedules to each note.
     */
    public function countNotes($total) {
        $arResult = array();

        foreach (NOTAS as &$nota) {
            if ( $total >= $nota ) {
                array_push( $arResult, floor( $total / $nota ) );

                $total = $total % $nota;
            } else {
                array_push( $arResult, 0 );
            }
        }
        
        return $arResult;
    }

}
