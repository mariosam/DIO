<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Resto2.php");

class Resto2Test extends TestCase {

    public function testResto2() {
        $obj = new Resto2();

        $obj->printAllRest2(8);
    }

}
