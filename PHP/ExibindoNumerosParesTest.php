<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ExibindoNumerosPares.php");

class ExibindoNumerosParesTest extends TestCase {

    public function testExibindoNumerosPares() {
        $obj = new ExibindoNumerosPares();
        //Test 1
        $want = [2, 4, 6];
        $got = $obj->countEve( 6 );
        $this->assertEquals($want, $got);
        //Test 2
        $want = [2, 4, 6, 8, 10, 12];
        $got = $obj->countEve( 13 );
        $this->assertEquals($want, $got);
    }

}
