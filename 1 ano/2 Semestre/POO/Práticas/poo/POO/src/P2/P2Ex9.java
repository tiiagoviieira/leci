package P2;
import java.util.Scanner;

public class P2Ex9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor");
        int a = input.nextInt();
        input.close();
        
        // Imprimindo a contagem decrescente
        for (int i = a; i >= 0; i--) {
            System.out.print(i);
            
            // Verificando se é múltiplo de 10 para inserir quebra de linha
            if (i % 10 == 0) {
                System.out.println();
            } else if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
