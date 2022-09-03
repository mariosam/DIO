<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("EntradaSaidaLendoPulandoNomes.php");

class EntradaSaidaLendoPulandoNomesTest extends TestCase {

    public function testEntradaSaidaLendoPulandoNomes() {
        $obj = new EntradaSaidaLendoPulandoNomes();
        //Test 1
        $want = ["UFCG", "ITA", "URI"];
        $got = $obj->giveMe379( ["USP","UFPE","UFCG","UFRN","UFRJ","IME","ITA","UNIOESTE","URI","UFG"] );
        echo "\nTest 1: retornou " . json_encode($got) . " == esperado: " . json_encode($want);
        $this->assertEquals($want, $got);
        //Test 2
        $want = ["UNIFEI","UFRGS","UFU"];
        $got = $obj->giveMe379( ["UnB","UFMG","UNIFEI","UECE","UNICAMP","INATEL","UFRGS","UNIFESO","UFU","PUC"] );
        echo "\nTest 2: retornou " . json_encode($got) . " == esperado: " . json_encode($want);
        $this->assertEquals($want, $got);
    }

}
