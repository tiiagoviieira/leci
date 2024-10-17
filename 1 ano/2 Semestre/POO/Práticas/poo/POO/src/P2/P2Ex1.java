package P2;
import java.util.Scanner;

public class P2Ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor da distância em KM");
        Float distancia = input.nextFloat();
        input.close();
        System.out.println("A distância inserida em KM é " + ((distancia * 0.6)) + " Milhas");
    }
}
