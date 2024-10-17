package P3;
import java.util.Scanner;

public class P3Ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor do investimento(>1000€)");
        Float investimento = input.nextFloat();
        System.out.println("Insira o taxa de juros(0 a 5%)");
        Float juros = input.nextFloat();
        input.close();
        for (int i = 0; i <= 12; i++) {
            investimento = investimento * ((juros/100) + 1);
            System.out.println(investimento);
        }
        System.out.println("Investimento no final : " + investimento);
    }
}
