<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ProibidoEntradaDeMenores.php");

class ProibidoEntradaDeMenoresTest extends TestCase {

    public function testProibidoEntradaDeMenores() {
        $obj = new ProibidoEntradaDeMenores();
        //Test 1
        $want = [4, 15];
        $got = $obj->forbidenUnder18( [4, 18, 22, 15, 50] );
        $this->assertEquals($want, $got);
        //Test 2
        $want = [6, 12, 17, 8];
        $got = $obj->forbidenUnder18( [6, 54, 12, 30, 17, 8, 24] );
        $this->assertEquals($want, $got);
        //Test 3
        $want = [15];
        $got = $obj->forbidenUnder18( [18, 22, 15, 99] );
        $this->assertEquals($want, $got);
    }

}
