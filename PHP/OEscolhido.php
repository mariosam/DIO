<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+checkingHighestNote(["1000 5", "1001 10", "1002 6"]);

class OEscolhido {

    /**
     * Check note of students to intercamb.
     */
    public function checkingHighestNote($students = []) {
        $result = "Minimum note not reached";

        //remove as matriculas e mantem apenas as notas
        $arrNotes = array_map(function($student) {
            return explode(" ", $student)[1];
        }, $students);

        //recupera a maior nota do array acima
        $note = max($arrNotes);

        //se houver alguem aprovado
        if ( $note >= 8 ) {
            //recupera a matricula do aluno com a maior nota
            $indice = array_search($note, $arrNotes);

            $result = explode(" ", $students[$indice])[0];
        }

        return $result;
    }

}
