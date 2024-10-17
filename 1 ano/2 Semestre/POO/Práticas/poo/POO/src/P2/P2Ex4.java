package P2;
import java.util.Scanner;

public class P2Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor do investimento!");
        Float valor = input.nextFloat();
        System.out.println("Insira a taxa de juros mensal fixa!");
        Float taxa = input.nextFloat();
        input.close();
        Float juros = (taxa / 100) + 1; 
        for (int x = 1; x <= 3; x++) {
            valor = valor * juros;
        }
        System.out.println("A energia necessária é " + valor);
    }
}
