<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("TriangulosPoligonosRegulares.php");

class TriangulosPoligonosRegularesTest extends TestCase {

    public function testTriangulosPoligonosRegulares() {
        $obj = new TriangulosPoligonosRegulares();
        //Test 1
        $want = 1;
        $got = $obj->minTriangules(3);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 2;
        $got = $obj->minTriangules(4);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 3;
        $got = $obj->minTriangules(5);
        $this->assertEquals($want, $got);
    }

}
