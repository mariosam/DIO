/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./EncontreMaiorSubstring.js')

TEST('Starting EncontreMaiorSubstring test...', (t) => {
    //Test 1
    t.assert(OBJ.findTheBiggestSubstring("abcdef", "cdofhij") === 2, "Expect: 2")
    //Test 2
    t.assert(OBJ.findTheBiggestSubstring("TWO", "FOUR") === 1, "Expect: 1")
    //Test 3
    t.assert(OBJ.findTheBiggestSubstring("abracadabra", "open") === 0, "Expect: 0")
    //Test 4
    t.assert(OBJ.findTheBiggestSubstring("Hey This java is hot", "Java is a new paradigm") === 7, "Expect: 7")

    t.end()
})
