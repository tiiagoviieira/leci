package P12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PalavrasDiferentes {

    public PalavrasDiferentes () {

        ArrayList <String> palavrasExistentes = new ArrayList<>();
        int counter = 0;

        try (Scanner input = new Scanner(new File("palavras.txt"))) {
            while (input.hasNext()) {
                counter++;
                if (!(palavrasExistentes.contains(input.next()))) {
                    palavrasExistentes.add(input.next());
                }
            }
        } catch (FileNotFoundException e ) {
            System.out.println("File Not Found");
        }

        System.out.println("Total de palavras diferentes: " + palavrasExistentes.size());
        System.out.println("Total de palavras: " + counter);
    }

    public static void main(String[] args) {
        new PalavrasDiferentes();
    }

}
