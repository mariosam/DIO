<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ComprasNoSupermercado.php");

class ComprasNoSupermercadoTest extends TestCase {

    public function testComprasNoSupermercado() {
        $obj = new ComprasNoSupermercado();
        //Test 1
        $want = ["carne", "laranja", "picles", "suco"];
        $got = $obj->checkMyList(["carne", "laranja", "suco", "picles", "laranja", "picles"]);
        $this->assertEquals($want, $got);
        //Test 2
        $want = ["laranja", "pera"];
        $got = $obj->checkMyList(["laranja", "pera", "laranja", "pera", "pera"]);
        $this->assertEquals($want, $got);
    }
}
