<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+originPosition("AA");

class Robo {

    /**
     * Compare two commands and return the original position of robot.
     */
    public function originPosition($in = ""): bool {
        //separa os 2 comandos
        $start = $in{0};
        $end = $in{1};

        //se os comandos forem iguais
        if ( $start == $end ) return false;

        //se for subir e descer
        if ( ($start == 'W' && $end == 'S') || ($start == 'S' && $end == 'W') ) return true;

        //se for esquerda e direita
        if ( ($start == 'A' && $end != 'W' && $end != 'S') || ($end == 'A' && $end != 'W' && $end != 'S') ) return true;
    
        //outras combinacoes sao invaldias
        return false;
    }

}
