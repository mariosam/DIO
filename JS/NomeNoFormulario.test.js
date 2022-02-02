/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./NomeNoFormulario.js')

TEST('Starting NomeNoFormulario test...', (t) => {
    //Test 1
    t.assert(OBJ.checkNameSize("Fulano de Tal") === "YES", "Expect: Fulano de Tal = YES")
    //Test 2
    t.assert(OBJ.checkNameSize("Pedro de Alcantara Francisco Antonio Joao Carlos Xavier de Paula Miguel Rafael Joaquim Jose Gonzaga Pascoal Cipriano Serafim") === "NO", "Expect: Pedro de Alcantara... = NO")

    t.end()
})
