<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("UniformesDeFinalDeAno.php");

class UniformesDeFinalDeAnoTest extends TestCase {

    public function testUniformesDeFinalDeAno() {
        $obj = new UniformesDeFinalDeAno();
        //Test 1
        $want = ["branco P Maria Joao","branco P Maria Jose","vermelho P Marcio Guess"];
        $got = $obj->uniformsInOrder( ["Maria Joao","branco P","Marcio Guess","vermelho P","Maria Jose","branco P"] );
        $this->assertEquals($want, $got);
		//Test 2
		$want = ["branco P Cezar Torres Mo","branco P Maria Jose","branco M JuJu Mentina","branco G Adabi Finho","branco G Severina Rigudinha","vermelho P Amaro Dinha","vermelho P Baka Lhau","vermelho P Carlos Chade Losna","vermelho P Mangojata Mancuda"];
		$got = $obj->uniformsInOrder( ["Maria Jose","branco P","Mangojata Mancuda","vermelho P","Cezar Torres Mo","branco P","Baka Lhau","vermelho P","JuJu Mentina","branco M","Amaro Dinha","vermelho P","Adabi Finho","branco G","Severina Rigudinha","branco G","Carlos Chade Losna","vermelho P"] );
        $this->assertEquals($want, $got);
    }

}
