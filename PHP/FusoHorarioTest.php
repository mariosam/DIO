<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("FusoHorario.php");

class FusoHorarioTest extends TestCase {

    public function testFusoHorario() {
        $obj = new FusoHorario();
        //Test 1
        $want = 20;
        $got = $obj->localTime(10, 7, 3);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 2;
        $got = $obj->localTime(22, 6, -2);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 23;
        $got = $obj->localTime(0, 3, -4);
        $this->assertEquals($want, $got);
    }

}
