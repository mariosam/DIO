<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("PreenchimentoDeVetor2.php");

class PreenchimentoDeVetor2Test extends TestCase {

    public function testPreenchimentoDeVetor2() {
        $obj = new PreenchimentoDeVetor2();

        $obj->printAllVector2(3);
    }

}
