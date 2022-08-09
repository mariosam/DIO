<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("OrdenacaoDePalavrasPorTamanho.php");

class OrdenacaoDePalavrasPorTamanhoTest extends TestCase {

    public function testOrdenacaoDePalavrasPorTamanho() {
        $obj = new OrdenacaoDePalavrasPorTamanho();
        //Test 1
        $want = "midnight three four mond One at";
        $got = $obj->orderWordsBySize("One three four mond at midnight");
        echo "\nTest 1: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 2
        $want = "three five one";
        $got = $obj->orderWordsBySize("one three five");
        echo "\nTest 2: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
    }

}
