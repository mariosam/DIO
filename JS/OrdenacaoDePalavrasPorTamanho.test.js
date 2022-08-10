/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./OrdenacaoDePalavrasPorTamanho.js')

TEST('Starting OrdenacaoDePalavrasPorTamanho test...', (t) => {
    //Test 1
    t.assert(OBJ.orderWordsBySize("One three four mond at midnight") === "midnight three four mond One at", "Expect: midnight three four mond One at")
    //Test 2
    t.assert(OBJ.orderWordsBySize("one three five") === "three five one", "Expect: three five one")

    t.end()
})
 
