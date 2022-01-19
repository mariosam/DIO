<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("BatalhaDeDigitrons.php");

class BatalhaDeDigitronsTest extends TestCase {

    public function testBatalhaDeDigitrons() {
        $obj = new BatalhaDeDigitrons();
        //Test 1
        $want = "Guarte";
        $got = $obj->winnerBattle(5, [12, 23, 15], [42, 12, 20]);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Empate";
        $got = $obj->winnerBattle(2, [52, 1, 11], [1, 52, 1]);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "Bruno";
        $got = $obj->winnerBattle(3, [95, 12, 22], [5, 51, 21]);
        $this->assertEquals($want, $got);
    }

}
