<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Idades.php");

class IdadesTest extends TestCase {

    public function testIdades() {
        $obj = new Idades();
        //Test 1
        $want = 39.25;
        $got = $obj->calcAverage([34, 56, 44, 23]);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 28.60;
        $got = $obj->calcAverage([28, 17, 41, 23, 34]);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 38.25;
        $got = $obj->calcAverage([24, 29, 48, 52]);
        $this->assertEquals($want, $got);
        //Test 4
        $want = 28.00;
        $got = $obj->calcAverage([10, 2, 6, 54, 22, 89, 16, 25]);
        $this->assertEquals($want, $got);
    }

}
