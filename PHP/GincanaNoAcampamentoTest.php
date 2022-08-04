<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("GincanaNoAcampamento.php");

class GincanaNoAcampamentoTest extends TestCase {

    public function testGincanaNoAcampamento() {
        $obj = new GincanaNoAcampamento();
        //Test 1
        $want = "Fernanda";
        $got = $obj->winnerOfScavengerGame( [["Fernanda", "7"], ["Fernando", "9"], ["Gustavo", "11"]] );
        echo "\nTest 1: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
		//Test 2
		$want = "Pedro";
		$got = $obj->winnerOfScavengerGame( [["Maria", "7"], ["Pedro", "9"], ["Joao_Vitor", "5"], ["Isabel", "12"], ["Laura", "8"]] );
        echo "\nTest 2: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
		//Test 3
		$want = "Pedro";
		$got = $obj->winnerOfScavengerGame( [["Maria", "4"], ["Pedro", "3"], ["Joao", "2"]] );
        echo "\nTest 3: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
    }

}
