<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("SomaDeNumerosNaturais.php");

class SomaDeNumerosNaturaisTest extends TestCase {

    public function testSomaDeNumerosNaturais() {
        $obj = new SomaDeNumerosNaturais();
        //Test 1
        $want = 15;
        $got = $obj->sumAllNaturals(1, 5);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 500500;
        $got = $obj->sumAllNaturals(1, 1000);
        $this->assertEquals($want, $got);
    }

}
