<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

define("EMPATE", "Empate");
define("NONE", "DDD nao cadastrado");
define("BRASILIA", "Brasilia");
define("SALVADOR", "Salvador");
define("SAOPAULO", "Sao Paulo");
define("RIODEJANEIRO", "Rio de Janeiro");
define("JUIZDEFORA", "Juiz de Fora");
define("CAMPINAS", "Campinas");
define("VITORIA", "Vitoria");
define("BELOHORIZONTE", "Belo Horizonte");

//echo "The result is "+dddCity(12);

class DDD {

    /**
     * Return the name of the city using DDD reference.
     */
    public function dddCity($cod) {
        $result = NONE;

        switch ($cod) {
            case 61:
                $result = BRASILIA;
                break;
            case 71:
                $result = SALVADOR;
                break;
            case 11:
                $result = SAOPAULO;
                break;
            case 21:
                $result = RIODEJANEIRO;
                break;
            case 32:
                $result = JUIZDEFORA;
                break;
            case 19:
                $result = CAMPINAS;
                break;
            case 27:
                $result = VITORIA;
                break;
            case 31:
                $result = BELOHORIZONTE;
                break;
        }

        return $result;
    }

}
