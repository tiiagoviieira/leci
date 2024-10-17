package P3;
import java.util.Scanner;
import java.lang.Math;
public class P3Ex3 {
    public static void main(String[] args){
        String answer;
        do {
            double number = Math.round(Math.random() * 100);
            double guess = 0;
            System.out.println(number);
            int counter = 1;
            Scanner input = new Scanner(System.in);
            do {
                System.out.println("Insira a sua aposta!");
                guess = input.nextDouble();
                if (guess != number) {
                    System.out.println("Aposta Incorreta\n");
                    counter += 1;
                } else {
                    System.out.println("You WON!");
                    System.out.println("Tentativas Necessárias : " + counter);
                }
            } while (guess != number) ;  
            

            System.out.println("Do you which to play again?(Y or Yes | No or N)");
            answer = input.nextLine();

            input.close();
            
        } while (answer == "Y" || answer == "Yes") ;

    }       
}