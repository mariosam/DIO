/**
 * @version JAVASCRIPT (ES6)
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./PedraPapelTesouraLagartoSpock.js')

TEST('Starting PedraPapelTesouraLagartoSpock test...', (t) => {
    //Test 1
    t.assert(OBJ.jokenpoSpock("spock", "spock") === "empate", "Expect: empate")
    //Test 2
    t.assert(OBJ.jokenpoSpock("tesoura", "spock") === "Marcia", "Expect: Marcia")
    //Test 3
    t.assert(OBJ.jokenpoSpock("lagarto", "spock") === "Fernanda", "Expect: Fernanda")

    t.end()
})
