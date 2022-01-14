/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./TrigoNoTabuleiro.js')

TEST('Starting trigo_no_tabuleiro test...', (t) => {
    //Test 1
    t.assert(OBJ.cornToReceive(0) === 0, "Expect: 0 = 0 kg")
    //Test 2
    t.assert(OBJ.cornToReceive(8) === 0, "Expect: 8 = 0 kg")
    //Test 3
    t.assert(OBJ.cornToReceive(16) === 5, "Expect: 16 = 5 kg")
    //Test 4
    t.assert(OBJ.cornToReceive(24) === 1398, "Expect: 24 = 1398 kg")
    //Test 5
    t.assert(OBJ.cornToReceive(32) === 357913, "Expect: 32 = 357913 kg")
    //Test 6
    t.assert(OBJ.cornToReceive(40) === 91625968, "Expect: 40 = 91625968 kg")
    //Test 7
    t.assert(OBJ.cornToReceive(48) === 23456248059, "Expect: 48 = 23456248059 kg")
    //Test 8
    t.assert(OBJ.cornToReceive(56) === 6004799503160, "Expect: 56 = 6004799503160 kg")
    //Test 9
    t.assert(OBJ.cornToReceive(64) === 1537228672809129, "Expect: 64 = 1537228672809129 kg")

    t.end()
})
 
