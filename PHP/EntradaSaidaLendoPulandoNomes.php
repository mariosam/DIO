<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+giveMe379( ["USP","UFPE","UFCG","UFRN","UFRJ","IME","ITA","UNIOESTE","URI","UFG"] );

class EntradaSaidaLendoPulandoNomes {

    /**
     * Return the names of position 3, 7 and 9.
     */
    public function giveMe379($ar = []) {
        return [$ar[2], $ar[6], $ar[8]];
    }

}
