<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

class GincanaNoAcampamento {

    /**
     * Identify the winner of the scavenger game.
     */
    public function winnerOfScavengerGame($ops = array()) {
        $lista = array();

        //passa o array de dados para a lista de estudantes
        for ($i = 0; $i < count($ops); $i++) {
            $lista[$i] = new Student( $ops[$i][0], $ops[$i][1] );
        }

        $position = 0;
        $card = $lista[0]->card;

        while (sizeof($lista) > 1) {
            if ($card % 2 != 0) {
                $position = ($position + $card) % sizeof($lista);
            } else {
                $position = ($position - ($card % sizeof($lista))) % sizeof($lista);

                // if the position becomes negative, we must make it positive. So, we subtract from the list size.
                if ($position < 0) $position = sizeof($lista) + $position;
            }

            $card = $lista[$position]->card;
            array_splice($lista, $position, 1);

            // if odd, move back one position to ensure that in the next iteration the correct position is pointed out.
            if ($card % 2 != 0) $position--;
        }

        return $lista[0]->name;
    }
}

/**
 * Objeto do tipo estudante
 */
class Student {
 
    public $name;
    public $card;

    public function __construct($name = "", $card = 0) {
        $this->name = $name;
        $this->card = $card;
    }
}
