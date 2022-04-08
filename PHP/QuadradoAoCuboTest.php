<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("QuadradoAoCubo.php");

class QuadradoAoCuboTest extends TestCase {

    public function testQuadradoAoCubo() {
        $obj = new QuadradoAoCubo();
        //Test 1
        $want = [[1,1,1], [2,4,8], [3,9,27], [4,16,64], [5,25,125]];
        $got = $obj->loadSquareAndCumbe( 5 );
        $this->assertEquals($want, $got);
    }

}
