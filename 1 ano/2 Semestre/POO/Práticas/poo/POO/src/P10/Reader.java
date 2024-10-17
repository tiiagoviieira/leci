package P10;

import java.util.*;
import java.io.*;

public class Reader {

    public static void main(String[] args) throws IOException{ 
        Scanner input = new Scanner(new FileReader("/Users/tiagovieira/Downloads/Práticas/poo/POO/src/P10/Book.java")); 
        ArrayList<String> wordsBigger2 = new ArrayList<>();

        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            if (word.length() > 2) {
                wordsBigger2.add(word);
            }
        }
        input.close();

        Iterator<String> iterator = wordsBigger2.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (!word.matches("[a-zA-Z]+")) {
                iterator.remove();
            }
        }

        System.out.println("Words with only letters:");
        for (String word : wordsBigger2) {
            System.out.println(word);
        }

        System.out.println("Acaba com 's':");
        for (String word : wordsBigger2) {
            if (word.endsWith("s")) {
                System.out.println(word);
            }
        }


    }

}
