<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("TrigoNoTabuleiro.php");

class TrigoNoTabuleiroTest extends TestCase {

    public function testTrigoNoTabuleiro() {
        $obj = new TrigoNoTabuleiro();
		//Test 1
		$want = 0;
		$got = $obj->cornToReceive(0);
		$this->assertEquals($want, $got);
		//Test 2
		$want = 0;
		$got = $obj->cornToReceive(8);
		$this->assertEquals($want, $got);
		//Test 3
		$want = 5;
		$got = $obj->cornToReceive(16);
		$this->assertEquals($want, $got);
		//Test 4
		$want = 1398;
		$got = $obj->cornToReceive(24);
		$this->assertEquals($want, $got);
		//Test 5
		$want = 357913;
		$got = $obj->cornToReceive(32);
		$this->assertEquals($want, $got);
		//Test 6
		$want = 91625968;
		$got = $obj->cornToReceive(40);
		$this->assertEquals($want, $got);
		//Test 7
		$want = 23456248059;
		$got = $obj->cornToReceive(48);
		$this->assertEquals($want, $got);
		//Test 8
		$want = 6004799503160;
		$got = $obj->cornToReceive(56);
		$this->assertEquals($want, $got);
		//Test 9
		$want = 1537228672809129;
		$got = $obj->cornToReceive(64);
		$this->assertEquals($want, $got);
    }
}
