<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("SeisNumerosImpares.php");

class SeisNumerosImparesTest extends TestCase {

    public function testSeisNumerosImpares() {
        $obj = new SeisNumerosImpares();

        $obj->printSixOdd(8);
        $obj->printSixOdd(7);
    }

}
