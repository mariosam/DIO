/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OEscolhido {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
        List<String> students = new ArrayList<>();

        for ( int i=0; i < N; i++ ) {
            students.add( sc.next() );
        }
		sc.close();

        System.out.println( checkingHighestNote( students ) );
	}

    /**
     * Check note of students to intercamb.
     */
    public static String checkingHighestNote(List<String> students) {
        String result = "Minimum note not reached";

        //remove as matriculas e mantem apenas as notas
        List<Double> arrNotes = students.stream()
                .map( s -> s.split(" ")[1] )
                .map( Double::parseDouble )
                .sorted()
                .collect( ArrayList::new, ArrayList::add, ArrayList::addAll );

        //recupera a maior nota do array acima
        String note = Collections.max( arrNotes ).toString();

        //se houver alguem aprovado
        if ( Double.parseDouble( note ) >= 8 ) {
            //apenas remove o zero final para comparar numero inteiro
            if ( note.substring( note.length()-1 ).equals( "0" ) ) note = note.substring( 0, note.length()-2 );

            //recupera a matricula do aluno com a maior nota
            for ( String s : students ) {
                if ( s.contains( " "+note ) ) {
                    result = s.split(" ")[0];
                    break;
                }
            }
        }

        return result;
    }
}
