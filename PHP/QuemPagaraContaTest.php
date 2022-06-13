<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("QuemPagaraConta.php");

class QuemPagaraContaTest extends TestCase {

    public function testQuemPagaraConta() {
        $obj = new QuemPagaraConta();
        //Test 1
        $want = [1, 1, 1, 0];
        $got = $obj->resultOfSum( [3, 11, 7, 18] );
        $this->assertEquals($want, $got);
		//Test 2
		$want = [1, 1, 1, 1, 1, 1, 1, 1];
		$got = $obj->resultOfSum( [7, 1, 1, 3, 3, 1, 7, 99] );
        $this->assertEquals($want, $got);
		//Test 3
		$want = [0, 0, 0, 0, 0, 0, 0];
		$got = $obj->resultOfSum( [6, 2, 2, 4, 8, 10, 128] );
        $this->assertEquals($want, $got);
    }

}
