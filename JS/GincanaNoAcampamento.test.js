/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./GincanaNoAcampamento.js')

TEST('Starting GincanaNoAcampamento test...', (t) => {
    //Test 1
    t.assert(OBJ.winnerOfScavengerGame([["Fernanda", "7"], ["Fernando", "9"], ["Gustavo", "11"]]) === "Fernanda", "Expect: Fernanda")
    //Test 2
    t.assert(OBJ.winnerOfScavengerGame([["Maria", "7"], ["Pedro", "9"], ["Joao_Vitor", "5"], ["Isabel", "12"], ["Laura", "8"]]) === "Pedro", "Expect: Pedro")
    //Test 3
    t.assert(OBJ.winnerOfScavengerGame([["Maria", "4"], ["Pedro", "3"], ["Joao", "2"]]) === "Pedro", "Expect: Pedro")

    t.end()
})
