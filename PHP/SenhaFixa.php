<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+checkPass(2022);

define("BLOCKED", "Senha Invalida");
define("GRANTED", "Acesso Permitido");
define("SWORDFISH", 2002);

class SenhaFixa {

    /**
     * Check if the password is valid.
     */
    public function checkPass($pass) {
        $result = BLOCKED;

        if ( $pass == SWORDFISH ) $result = GRANTED;

        return $result;
    }

}
