package P3;
import java.util.Scanner;

public class P3Ex1 {
    public static void main(String[] args){
        int a = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Insira o valor");
            a = input.nextInt();
            input.close();
            if (a <= 0) {
                System.out.println("Valor inserido Negativo");
            }
        } while (a <= 0) ;

        int soma = 0;

        for (int x = 2; x <= a; x++) {
            boolean isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                soma += x;
            }
        }
        soma += a;

        System.out.println(soma);

        
    }       
}