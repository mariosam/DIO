<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("NotasDaProva.php");

class NotasDaProvaTest extends TestCase {

    public function testNotasDaProva() {
        $obj = new NotasDaProva();
        //Test 1
        $want = "D";
        $got = $obj->takeResult(12);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "A";
        $got = $obj->takeResult(87);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "E";
        $got = $obj->takeResult(0);
        $this->assertEquals($want, $got);
    }

}
