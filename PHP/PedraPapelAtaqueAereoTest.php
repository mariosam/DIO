<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("PedraPapelAtaqueAereo.php");

class PedraPapelAtaqueAereoTest extends TestCase {

    public function testPedraPapelAtaqueAereo() {
        $obj = new PedraPapelAtaqueAereo();
        //Test 1
        $want = "Sem ganhador";
        $got = $obj->jokenpoWinner("pedra", "pedra");
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Jogador 1 venceu";
        $got = $obj->jokenpoWinner("ataque", "papel");
        $this->assertEquals($want, $got);
        //Test 3
        $want = "Jogador 1 venceu";
        $got = $obj->jokenpoWinner("Ataque", "Pedra");
        $this->assertEquals($want, $got);
        //Test 4
        $want = "Jogador 2 venceu";
        $got = $obj->jokenpoWinner("Pedra", "Ataque");
        $this->assertEquals($want, $got);
        //Test 5
        $want = "Jogador 1 venceu";
        $got = $obj->jokenpoWinner("Pedra", "Papel");
        $this->assertEquals($want, $got);
        //Test 6
        $want = "Jogador 2 venceu";
        $got = $obj->jokenpoWinner("Papel", "Pedra");
        $this->assertEquals($want, $got);
        //Test 7
        $want = "Jogador 1 venceu";
        $got = $obj->jokenpoWinner("Ataque", "Papel");
        $this->assertEquals($want, $got);
        //Test 8
        $want = "Jogador 2 venceu";
        $got = $obj->jokenpoWinner("Papel", "Ataque");
        $this->assertEquals($want, $got);
        //Test 9
        $want = "Ambos venceram";
        $got = $obj->jokenpoWinner("Papel", "Papel");
        $this->assertEquals($want, $got);
        //Test 10
        $want = "Sem ganhador";
        $got = $obj->jokenpoWinner("Pedra", "Pedra");
        $this->assertEquals($want, $got);
        //Test 11
        $want = "Aniquilacao mutua";
        $got = $obj->jokenpoWinner("Ataque", "Ataque");
        $this->assertEquals($want, $got);
    }

}
