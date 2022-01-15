<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ParOuImpar.php");

class ParOuImparTest extends TestCase {

    public function testParOuImpar() {
        $obj = new ParOuImpar();
        //Test 1
        $want = "ODD NEGATIVE";
        $got = $obj->typeNumberMsg(-5);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "NULL";
        $got = $obj->typeNumberMsg(0);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "ODD POSITIVE";
        $got = $obj->typeNumberMsg(3);
        $this->assertEquals($want, $got);
        //Test 4
        $want = "EVEN NEGATIVE";
        $got = $obj->typeNumberMsg(-4);
        $this->assertEquals($want, $got);
    }

}
