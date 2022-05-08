<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Diferenca.php");

class DiferencaTest extends TestCase {

    public function testDiferenca() {
        $obj = new Diferenca();
        //Test 1
        $want = -26;
        $got = $obj->showDifference(5, 6, 7, 8);
        $this->assertEquals($want, $got);
        //Test 2
        $want = -56;
        $got = $obj->showDifference(0, 0, 7, 8);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 86;
        $got = $obj->showDifference(5, 6, -7, 8);
        $this->assertEquals($want, $got);
    }

}
