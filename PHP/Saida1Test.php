<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Saida1.php");

class Saida1Test extends TestCase {

    public function testSaida1() {
        $obj = new Saida1();

        $obj->printBox("-", "-");
		    $obj->printBox("|", " ");
        $obj->printBox("-", "-");
    }

}
