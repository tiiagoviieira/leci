package P2;
import java.util.Scanner;

public class P2Ex8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o comprimento do 1º cateto");
        Float a = input.nextFloat();
        System.out.println("Insira o comprimento do 2º cateto");
        Float b = input.nextFloat();
        input.close();
        Double hipotenusa = Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
        Double angulo = Math.acos((a/hipotenusa));
        System.out.println("A hipotenusa é " + hipotenusa);
        System.out.println("O ângulo é " + angulo);
    }
}
