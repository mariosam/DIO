<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("OEscolhido.php");

class OEscolhidoTest extends TestCase {

    public function testOEscolhido() {
        $obj = new OEscolhido();
        //Test 1
        $want = "1001";
        $got = $obj->checkingHighestNote(["1000 5", "1001 10", "1002 6"]);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Minimum note not reached";
        $got = $obj->checkingHighestNote(["900775 5.7", "201553 7.9", "5032 6.2", "2088 2.1"]);
        $this->assertEquals($want, $got);
    }

}
