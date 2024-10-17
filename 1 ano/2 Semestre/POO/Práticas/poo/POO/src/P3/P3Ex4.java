package P3;
import java.util.Scanner;
import java.lang.Math;

public class P3Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o numero de alunos da turma!");
        int numTurma = input.nextInt();
        double[][] notas = new double[numTurma][3];
        for (int i = 0; i <  numTurma ; i++) {
            boolean notaMin = true;
            for (int j = 0; j <= 1 ; j++) {
                double nota;
                if ( j == 0 ) {
                    System.out.println("Insira a nota da Teorica!");
                    nota = input.nextDouble();
                } else {
                    System.out.println("Insira a nota da Prática!");
                    nota = input.nextDouble();
                }
                if (nota < 7.0) {notaMin = false;}
                notas[i][j] = nota;
            }
            double Teorica = Math.round(0.4 * notas[i][0]);
            double Pratica = Math.round(0.6 * notas[i][1]);
            if (notaMin == false) { notas[i][2] = 0; }
            else { notas[i][2] = Teorica + Pratica; }
        }
        input.close();
        System.out.printf("| %-10s | %-8s | %-4s |%n", "Teórica", "Prática", "Final");
        for (int i = 0 ; i < numTurma ; i++ ) {
            if (notas[i][2] == 0) {System.out.printf("| %-10s | %-8s | %5s |%n", notas[i][0], notas[i][1], "RNM");}
            else {System.out.printf("| %-10s | %-8s | %5s |%n", notas[i][0], notas[i][1], notas[i][2]);}
        }
    }
}
