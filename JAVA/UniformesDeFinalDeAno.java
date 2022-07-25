/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class UniformesDeFinalDeAno {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] array = new String[n+1];

        for (int i = 1; i <= n; i++) {
            array[i] = input.next();
        }
        input.close();
        
        array = uniformsInOrder( array );
        for (String num : array) {
            System.out.println( num );
        }
	}

    /**
     * Return the order of uniforms in the array
     */
    public static String[] uniformsInOrder(String[] inputs) {
        ArrayList<ListUniform> list = new ArrayList<ListUniform>();

        //guarda os valores em um objeto
        for (int i = 1; i < inputs.length; i++) {
            String nome = inputs[i];
            i++; //proximo item do array
            String[] temp = inputs[i].split(" "); //separa os itens do array
            String cor = temp[0]; //cor do uniforme
            String tamanho = temp[1]; //tamanho do uniforme

            ListUniform uniforme = new ListUniform( cor, tamanho, nome);
            list.add(uniforme);
        }

        //criar uma ordem no objeto
        Arrays.sort( list, new Comparator<ListUniform>() {
            @Override
            public int compare(ListUniform o1, ListUniform o2) {
                if (o1.getCor().equals(o2.getCor())) {
                    if (o1.getTamanho().equals(o2.getTamanho())) {
                        return o1.getNome().compareTo(o2.getNome());
                    } else {
                        return o1.getTamanho().compareTo(o2.getTamanho());
                    }
                } else {
                    return o1.getCor().compareTo(o2.getCor());
                }
            }
        });

        return list.toArray( new String[list.size()] );
       
        //return ar.stream().mapToInt(Integer::intValue).toArray();
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
