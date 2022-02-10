/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./TopN.js')

TEST('Starting TopN test...', (t) => {
    //Test 1
    t.assert(OBJ.topRange(7) === "Top 10", "Expect: 7 = Top 10")
    //Test 2
    t.assert(OBJ.topRange(25) === "Top 25", "Expect: 25 = Top 25")
    //Test 3
    t.assert(OBJ.topRange(26) === "Top 50", "Expect: 26 = Top 50")

    t.end()
})
