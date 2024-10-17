package P11;

import java.io.*;
import java.util.*;

public class WordPair {

    public static void main(String[] args) {
        String nomeFicheiro = "/Users/tiagovieira/Downloads/Práticas/poo/POO/src/P11/major.txt";

        Map<String, Map<String, Integer>> paresPalavras = processFile(nomeFicheiro);
        printparesPalavras(paresPalavras);
    }

    public static Map<String, Map<String, Integer>> processFile(String nomeFicheiro) {
        Map<String, Map<String, Integer>> paresPalavras = new TreeMap<>();

        try (Scanner scanner = new Scanner(new File(nomeFicheiro))) {
            scanner.useDelimiter("[\\t\\n.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\' ]+");
            String palavraAnterior = null;

            while (scanner.hasNext()) {
                String palavra = scanner.next().toLowerCase();
                if (palavra.length() < 3) continue;
                if (palavraAnterior != null) {
                    paresPalavras.putIfAbsent(palavraAnterior, new TreeMap<>());
                    Map<String, Integer> segundoMap = paresPalavras.get(palavraAnterior);
                    segundoMap.put(palavra, segundoMap.getOrDefault(palavra, 0) + 1);
                }

                palavraAnterior = palavra;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + nomeFicheiro);
        }

        return paresPalavras;
    }

    public static void printparesPalavras(Map<String, Map<String, Integer>> paresPalavras) {
        for (Map.Entry<String, Map<String, Integer>> entrada : paresPalavras.entrySet()) {
            String key = entrada.getKey();
            Map<String, Integer> segundoMap = entrada.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(key).append("={");
            boolean primeiro = true;
            for (Map.Entry<String, Integer> segundaEntrada : segundoMap.entrySet()) {
                if (!primeiro) {
                    sb.append(", ");
                }
                sb.append(segundaEntrada.getKey()).append("=").append(segundaEntrada.getValue());
                primeiro = false;
            }
            sb.append("}");
            System.out.println(sb.toString());
        }
    }
}

