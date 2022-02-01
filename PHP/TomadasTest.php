<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Tomadas.php");

class TomadasTest extends TestCase {

    public function testTomadas() {
        $obj = new Tomadas();
        //Test 1
        $want = 8;
        $got = $obj->maxDevices(2, 4, 3, 2);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 21;
        $got = $obj->maxDevices(6, 6, 6, 6);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 5;
        $got = $obj->maxDevices(2, 2, 2, 2);
        $this->assertEquals($want, $got);
    }

}
