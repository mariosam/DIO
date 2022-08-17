<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+passwordValidator(44);

define("VALIDO", "Senha valida.");
define("INVALIDO", "Senha invalida.");

class ValidadorDeSenhasComRequisitos {

    /**
     * Check if password is valid.
     */
    public function passwordValidator($pwd = ""): string {
        $result = VALIDO;
        
        //valida o tamanho
        if (strlen($pwd) < 6 || strlen($pwd) > 32) {
            $result = INVALIDO;
        //valida se possui espacos ou caracteres nao alphanumericos
        } else if (preg_match("#\s/g#", $pwd) || preg_match("#\W+#", $pwd)) {
            $result = INVALIDO;
        //valida se possui elementos obrigatorios (maiusculas, minusculas, e numeros)
        } else if (!preg_match("#[A-Z]#", $pwd) || !preg_match("#[a-z]#", $pwd) || !preg_match("#[0-9]#", $pwd)) {
            $result = INVALIDO;
        }

        return $result;
    }

}
