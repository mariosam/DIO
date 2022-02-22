<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("NossosDiasNuncaVoltarao.php");

class NossosDiasNuncaVoltaraoTest extends TestCase {

    public function testNossosDiasNuncaVoltarao() {
        $obj = new NossosDiasNuncaVoltarao();
        //Test 1
        $want = "L";
        $got = $obj->cutWord(1);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "LIF";
        $got = $obj->cutWord(3);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "LIFE IS";
        $got = $obj->cutWord(7);
        $this->assertEquals($want, $got);
    }

}
