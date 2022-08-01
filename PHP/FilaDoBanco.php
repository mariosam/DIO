<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+changingPlaces([4, 4, 6, 2]);

class FilaDoBanco {

    /**
     * Count how many changes need to right the queue.
     */
    public function changingPlaces($ar): int {
        $result = 0;
        //faz uma copia do array
        $pwdOrder = $ar;
        //inverte a ordem do array
        rsort($pwdOrder);

        //verifica se alguem precisa trocar de lugar na fila
        for ( $i = 0; $i < count($ar); $i++ ) {
            if ( $ar[$i] == $pwdOrder[$i] ) $result++;
        }

        return $result;
    }

}
