/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class GincanaNoAcampamento {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        String[][] ops = new String[n][2];

        while ( n > 0 ) {
            for ( int i = 0; i < n; i++ ) {
                String[] temp = sc.nextLine().split(" ");
                ops[i][0] = temp[0];
                ops[i][1] = temp[1];
            }
            System.out.println( winnerOfScavengerGame( ops ) );
            n = sc.nextInt();
        }
		sc.close();
	}

    /**
     * Identify the winner of the scavenger game.
     */
    public static String winnerOfScavengerGame(String[][] ops) {
        var students = new LinkedList<Student>();

        //passa o array de dados para a lista de estudantes
        for (var i = 0; i < ops.length; i++) {
            students.add(new Student( ops[i][0], Integer.parseInt(ops[i][1]) ));
        }

        var position = 0;
        var card = students.getFirst().getCard();

        while (students.size() > 1) {

            if (card % 2 != 0) {
                position = (position + card) % students.size();
            } else {
                position = (position - (card % students.size())) % students.size();

                // if the position becomes negative, we must make it positive. So, we subtract from the list size.
                if (position < 0) position = students.size() + position;
            }

            card = students.get(position).getCard();
            students.remove(position);

            // if odd, move back one position to ensure that in the next iteration the correct position is pointed out.
            if (card % 2 != 0) position--;
        }

        //System.out.println("Vencedor(a): " + students.getFirst().getName());
        return students.getFirst().getName();
    }

    /**
     * Objeto do tipo estudante
     */
    public static class Student {
        private String name;
        private int card;

        public Student(String name, int card) {
            this.card = card;
            this.name = name;
        }

        public int getCard() {
            return card;
        }

        public String getName() {
            return name;
        }
    }
}
