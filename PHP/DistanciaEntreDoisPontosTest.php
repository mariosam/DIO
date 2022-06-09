<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("DistanciaEntreDoisPontos.php");

class DistanciaEntreDoisPontosTest extends TestCase {

    public function testDistanciaEntreDoisPontos() {
        $obj = new DistanciaEntreDoisPontos();
        //Test 1
        $want = "4.4721";
        $got = $obj->getDistance(1.0, 7.0, 5.0, 9.0);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "16.1483";
        $got = $obj->getDistance(-2.5, 0.4, 12.1, 7.3);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "16.4575";
        $got = $obj->getDistance(2.5, -0.4, -12.2, 7.0);
        $this->assertEquals($want, $got);
    }

}
