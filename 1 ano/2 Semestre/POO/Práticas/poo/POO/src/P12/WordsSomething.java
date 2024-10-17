package P12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Scanner;

public class WordsSomething {

    public WordsSomething () {
        TreeMap <Character, List <String> > words = new TreeMap<>();
        try (Scanner input = new Scanner (new File("palavras.txt"));) {
            while (input.hasNext()) {
                String word = input.next();
                char firstLetter = word.charAt(0);
                if (words.containsKey(firstLetter)) {
                    if (words.containsValue(word)) {

                    } else {
                        List <String> newWord = new ArrayList<>();
                        newWord.add(word);
                        newWord.add("1");
                        words.get(firstLetter).add(newWord);
                    }
                } else {
                    List <String> newWord = new ArrayList<>();
                    newWord.add(word);
                    newWord.add("1");
                    words.put(firstLetter, newWord);
                }
            }
        } catch (FileNotFoundException e ) {
            System.out.println("File Not Found");
        }
    }

    public static void main(String[] args) {
        new WordsSomething();
    }

}
