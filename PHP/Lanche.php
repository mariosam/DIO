<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+totalToPay(3, 2);

class Lanche {

    /**
     * Sum total to pay.
     */
    public function totalToPay($cod, $qtd) {
        $result = 0;

        switch ($cod) {
            case 1:
                $result = $qtd * 4.00;
                break;
            case 2:
                $result = $qtd * 4.50;
                break;
            case 3:
                $result = $qtd * 5.00;
                break;
            case 4:
                $result = $qtd * 2.00;
                break;
            case 5:
                $result = $qtd * 1.50;
                break;
        }

        return $result;
    }

}
