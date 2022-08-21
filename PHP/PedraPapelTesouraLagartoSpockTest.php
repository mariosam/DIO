<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("PedraPapelTesouraLagartoSpock.php");

class PedraPapelTesouraLagartoSpockTest extends TestCase {

    public function testPedraPapelTesouraLagartoSpock() {
        $obj = new PedraPapelTesouraLagartoSpock();
        //Test 1
        $want = "empate";
        $got = $obj->jokenpoSpock("spock", "spock");
        echo "\nTest 1: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Marcia";
        $got = $obj->jokenpoSpock("tesoura", "spock");
        echo "\nTest 2: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 3
        $want = "Fernanda";
        $got = $obj->jokenpoSpock("lagarto", "spock");
        echo "\nTest 3: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
    }

}
