/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./PedraPapelAtaqueAereo.js')

TEST('Starting PedraPapelAtaqueAereo test...', (t) => {
    //Test 1
    t.assert(OBJ.jokenpoWinner("pedra", "pedra") === "Sem ganhador", "Expect: Sem ganhador")
    //Test 2
    t.assert(OBJ.jokenpoWinner("ataque", "papel") === "Jogador 1 venceu", "Expect: Jogador 1 venceu")
    //Test 3
    t.assert(OBJ.jokenpoWinner("Ataque", "Pedra") === "Jogador 1 venceu", "Expect: Jogador 1 venceu")
    //Test 4
    t.assert(OBJ.jokenpoWinner("Pedra", "Ataque") === "Jogador 2 venceu", "Expect: Jogador 2 venceu")
    //Test 5
    t.assert(OBJ.jokenpoWinner("Pedra", "Papel") === "Jogador 1 venceu", "Expect: Jogador 1 venceu")
    //Test 6
    t.assert(OBJ.jokenpoWinner("Papel", "Pedra") === "Jogador 2 venceu", "Expect: Jogador 2 venceu")
    //Test 7
    t.assert(OBJ.jokenpoWinner("Ataque", "Papel") === "Jogador 1 venceu", "Expect: Jogador 1 venceu")
    //Test 8
    t.assert(OBJ.jokenpoWinner("Papel", "Ataque") === "Jogador 2 venceu", "Expect: Jogador 2 venceu")
    //Test 9
    t.assert(OBJ.jokenpoWinner("Papel", "Papel") === "Ambos venceram", "Expect: Ambos venceram")
    //Test 10
    t.assert(OBJ.jokenpoWinner("Pedra", "Pedra") === "Sem ganhador", "Expect: Sem ganhador")
    //Test 11
    t.assert(OBJ.jokenpoWinner("Ataque", "Ataque") === "Aniquilacao mutua", "Expect: Aniquilacao mutua")

    t.end()
})
