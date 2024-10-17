package P2;
import java.util.Scanner;

public class P2Ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor x de P1");
        Float x1 = input.nextFloat();
        System.out.println("Insira o valor y de P1");
        Float y1 = input.nextFloat();
        System.out.println("Insira o valor x de P2");
        Float x2 = input.nextFloat();
        System.out.println("Insira o valor y de P2");
        Float y2 = input.nextFloat();
        input.close();
        Double distância = Math.sqrt(((x1 - x2)*(x1 - x2)) + ((y1 - y2)*(y1 - y2)));
        distância = Math.abs(distância);
        System.out.println("A distância entre os pontos é " + distância);
    }
}
