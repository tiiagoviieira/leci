package P2;
import java.util.Scanner;

public class P2Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a distância no 1º trajeto!");
        Float d1 = input.nextFloat();
        System.out.println("Insira a velocidade no 1º trajeto!");
        Float v1 = input.nextFloat();
        System.out.println("Insira a distância no 2º trajeto!");
        Float d2 = input.nextFloat();
        System.out.println("Insira a velocidade no 2º trajeto!");
        Float v2 = input.nextFloat();
        input.close();
        Float velMedia;
        if (d1 > d2) {
            Float val = d2/d1;
            velMedia = (v1 + (v2*val)) / 2;
        } else {
            Float val = d1/d2;
            velMedia = (v2 + (v1*val)) / 2;
        }

        System.out.println("A velocidade média é " + velMedia);
    }
}
