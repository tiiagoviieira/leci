package P2;
import java.util.Scanner;

public class P2Ex10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double numero;
        double soma = 0;
        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;
        int contador = 0;
        System.out.print("Insira um número real: ");
        double primeiroNumero = input.nextDouble();
        
        do {
            System.out.print("Insira um número real (igual ao primeiro) para terminar => ");
            numero = input.nextDouble();
            
            // Atualizando o máximo e o mínimo
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            soma += numero;
            contador++;
        } while (numero != primeiroNumero);

        input.close();
        double media = soma / contador;
        System.out.println("Max: " + maximo);
        System.out.println("Min: " + minimo);
        System.out.println("Média: " + media);
        System.out.println("Total de números lidos: " + contador);
    }
}
