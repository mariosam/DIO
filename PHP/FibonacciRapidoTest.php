<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("FibonacciRapido.php");

class FibonacciRapidoTest extends TestCase {

    public function testFibonacciRapido() {
        $obj = new FibonacciRapido();
        //Test 1
        $want = 1.0;
        $got = $obj->binetFormule(1);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 1.0;
        $got = $obj->binetFormule(2);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 2.0;
        $got = $obj->binetFormule(3);
        $this->assertEquals($want, $got);
        //Test 4
        $want = 4181.0;
        $got = $obj->binetFormule(19);
        $this->assertEquals($want, $got);
    }

}
