<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Triangulo.php");

class TrianguloTest extends TestCase {

    public function testTriangulo() {
        $obj = new Triangulo();
        //Test 1
        $want = "Area = 10.0";
        $got = $obj->calcArea(6.0, 4.0, 2.0);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Perimetro = 12.1";
        $got = $obj->calcArea(6.0, 4.0, 2.1);
        $this->assertEquals($want, $got);
    }

}
