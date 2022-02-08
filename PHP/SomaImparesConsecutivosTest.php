<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("SomaImparesConsecutivos.php");

class SomaImparesConsecutivosTest extends TestCase {

    public function testSomaImparesConsecutivos() {
        $obj = new SomaImparesConsecutivos();
        //Test 1
        $want = 5;
        $got = $obj->oddsBetween(6, -5);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 13;
        $got = $obj->oddsBetween(15, 12);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 0;
        $got = $obj->oddsBetween(12, 12);
        $this->assertEquals($want, $got);
        //Test 4
        $want = 3;
        $got = $obj->oddsBetween(1, 5);
        $this->assertEquals($want, $got);
    }

}
