<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("TriDu.php");

class TriDuTest extends TestCase {

    public function testTriDu() {
        $obj = new TriDu();
		//Test 1
		$want = 10;
		$got = $obj->greatestCard(10, 7);
		$this->assertEquals($want, $got);
		//Test 2
		$want = 2;
		$got = $obj->greatestCard(2, 2);
		$this->assertEquals($want, $got);
    }
}
