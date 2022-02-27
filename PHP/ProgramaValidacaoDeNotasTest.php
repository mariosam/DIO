<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ProgramaValidacaoDeNotas.php");

class ProgramaValidacaoDeNotasTest extends TestCase {

    public function testProgramaValidacaoDeNotas() {
        $obj = new ProgramaValidacaoDeNotas();
        //Test 1
        $want = ["nota invalida","nota invalida","media = 6.75","novo calculo (1-sim 2-nao)","novo calculo (1-sim 2-nao)","media = 8.50","novo calculo (1-sim 2-nao)"];
        $got = $obj->startSystem([-3.5, 3.5, 11.0, 10.0, 4, 1, 8.0, 9.0, 2, 7.0]);
        $this->assertEquals($want, $got);
    }
}
