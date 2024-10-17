package P2;
import java.util.Scanner;

public class P2Ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a quantidade de água em KG!");
        Float peso = input.nextFloat();
        System.out.println("Insira a temperatura Final!");
        Float tempF = input.nextFloat();
        System.out.println("Insira a temperatura Inicial!");
        Float tempI = input.nextFloat();
        input.close();
        Float energia = peso * (tempF - tempI) * (4184);
        System.out.println("A energia necessária é " + energia);
    }
}
