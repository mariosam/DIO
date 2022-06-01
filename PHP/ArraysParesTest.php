<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ArraysPares.php");

class ArraysParesTest extends TestCase {

    public function testArraysPares() {
        $obj = new ArraysPares();
        //Test 1
        $want = [2, 18, 34];
        $got = $obj->returnOnlyEven( [2, 3, 5, 7, 11, 13, 18, 34] );
        $this->assertEquals($want, $got);
    }

}
