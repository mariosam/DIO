<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("OrdenandoNumerosParesImpares.php");

class OrdenandoNumerosParesImparesTest extends TestCase {

    public function testOrdenandoNumerosParesImpares() {
        $obj = new OrdenandoNumerosParesImpares();
        //Test 1
        $want = [4, 32, 34, 98, 654, 3456, 6789, 567, 543, 87];
        $got = $obj->orderOddsEvenNumbers( [4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98] );
        $this->assertEquals($want, $got);
		//Test 2
		$want = [6, 10, 7, 5];
		$got = $obj->orderOddsEvenNumbers( [10, 5, 6, 7] );
        $this->assertEquals($want, $got);
    }

}
