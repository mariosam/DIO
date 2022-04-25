/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let N = parseInt(gets());
let students = [];

for ( let i=0; i < N; i++ ) {
    students.push(gets());
}
console.log(checkingHighestNote(students));

/**
 * Check note of students to intercamb.
 */
function checkingHighestNote(students = []) {
    let result = "Minimum note not reached";
    
    //remove as matriculas e mantem apenas as notas
    let arrNotes = students.map(elem => {
        return parseFloat(elem.split(' ')[1]);
    });

    //recupera a maior nota do array acima
    let note = arrNotes.reduce( function(a, b) {
        return Math.max(a, b);
    });

    //se houver alguem aprovado
    if ( parseFloat(note) >= 8 ) {
        //recupera a matricula do aluno com a maior nota
        let matricula = students.find(elem => elem.split(' ')[1] == note );

        result = matricula.split(' ')[0];
    }

    return result;
}
module.exports = {checkingHighestNote}
