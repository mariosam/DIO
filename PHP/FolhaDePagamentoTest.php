<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("FolhaDePagamento.php");

class FolhaDePagamentoTest extends TestCase {

    public function testFolhaDePagamento() {
        $obj = new FolhaDePagamento();
        //Test 1
        $want = 550.00;
        $got = $obj->calcSalary(100, 5.50);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 4100.00;
        $got = $obj->calcSalary(200, 20.50);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 2254.75;
        $got = $obj->calcSalary(145, 15.55);
        $this->assertEquals($want, $got);
    }

}
