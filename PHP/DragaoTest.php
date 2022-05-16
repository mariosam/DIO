<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Dragao.php");

class DragaoTest extends TestCase {

    public function testDragao() {
        $obj = new Dragao();
        //Test 1
        $want = "Mais de 8000!";
        $got = $obj->checkEnergyLevel(8001);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Inseto!";
        $got = $obj->checkEnergyLevel(100);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "Inseto!";
        $got = $obj->checkEnergyLevel(200);
        $this->assertEquals($want, $got);
    }

}
