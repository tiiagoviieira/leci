package P2;
import java.util.Scanner;

public class P2Ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a temperatura em graus Celsius!");
        Float temperatura = input.nextFloat();
        input.close();
        System.out.println("A temperatura em graus Farenheit é " + ((temperatura * 1.8) + 32));
    }
}
