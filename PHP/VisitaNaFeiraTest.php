<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("VisitaNaFeira.php");

class VisitaNaFeiraTest extends TestCase {

    public function testVisitaNaFeira() {
        $obj = new VisitaNaFeira();
        //Test 1
        $want = 18;
        $got = $obj->totalPeppers(11, 7);
        $this->assertEquals($want, $got);
        //Test 2
        $want = -5;
        $got = $obj->totalPeppers(-11, 6);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 9;
        $got = $obj->totalPeppers(11, -2);
        $this->assertEquals($want, $got);
    }

}
