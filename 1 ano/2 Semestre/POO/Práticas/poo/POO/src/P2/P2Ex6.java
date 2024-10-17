package P2;
import java.util.Scanner;

public class P2Ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o tempo em segundos!");
        Float segundos = input.nextFloat();
        input.close();
        float horas = Math.round(segundos / 3600);
        float minutos = Math.round((segundos % 3600) / 60);
        float secs = segundos - ( (horas * 3600) + (minutos*60) );
        System.out.println(horas);
        System.out.println(minutos);
        System.out.println(secs);
    }
}
