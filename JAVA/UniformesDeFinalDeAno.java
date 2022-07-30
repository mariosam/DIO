/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class UniformesDeFinalDeAno {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] array = new String[n];

        //le todas as entradas e guarda em um array
        while ( n > 0 ) {
            String line = input.nextLine();

            if ( line != "0" ) {
                array[n-1] = line;
            } else {
                n = input.nextInt();
            }
        }
        input.close();
        
        //chama funcao e exibe resultados
        array = uniformsInOrder( array );
        for (String item : array) {
            System.out.println( item );
        }
	}

    /**
     * Return the order of uniforms in the array
     */
    public static String[] uniformsInOrder(String[] inputs) {
        ArrayList<ListUniform> list = new ArrayList<ListUniform>();

        //guarda os valores em um objeto
        for (int i = 0; i < inputs.length; i++) {
            String nome = inputs[i];
            i++; //proximo item do array
            String[] temp = inputs[i].split(" "); //separa os itens do array
            String cor = temp[0]; //cor do uniforme
            String tamanho = temp[1]; //tamanho do uniforme

            ListUniform uniforme = new ListUniform( cor, tamanho, nome );
            list.add(uniforme);
        }

        //criar uma ordem no objeto
        list.sort(new Comparator<ListUniform>() {
            @Override
            public int compare(ListUniform o1, ListUniform o2) {
                if (o1.getColor().equals(o2.getColor())) {
                    if (o1.getSize().equals(o2.getSize())) {
                        return o1.getNames().compareTo(o2.getNames());
                    } 
                    return o2.getSize().compareTo(o1.getSize());
                }
                return o1.getColor().compareTo(o2.getColor());
            }
        });

        //retorna o array ordenado
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i).toString();
        }

        return result;
    }
}

class ListUniform {

    private String color;
    private String size;
    private String names;

    public ListUniform(String color, String size, String names) {
        this.size = size;
        this.color = color;
        this.names = names;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getNames();
    }
}
