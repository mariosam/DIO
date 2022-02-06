<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("FatorialSimples.php");

class FatorialSimplesTest extends TestCase {

    public function testFatorialSimples() {
        $obj = new FatorialSimples();
        //Test 1
        $want = 24;
        $got = $obj->simpleFactorial(4);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 720;
        $got = $obj->simpleFactorial(6);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 1;
        $got = $obj->simpleFactorial(1);
        $this->assertEquals($want, $got);
    }

}
