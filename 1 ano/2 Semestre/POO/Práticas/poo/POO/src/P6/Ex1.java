package P6;
import P5.DateYMD;
import java.util.Scanner;


public class Ex1 {

    public static void main(String[] args) {
        makeNewPerson();
    }

    private static void makeNewPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nm = input.next();
        System.out.println("Insira o C.C.: ");
        int cc = input.nextInt();
        System.out.println("Insira a data de nascimento: ");
        DateYMD l = new DateYMD(1,1,1);
        boolean bool = true;
        do {
            System.out.println("Insira o dia: ");
            int d = input.nextInt();
            System.out.println("Insira o mes: ");
            int m = input.nextInt();
            System.out.println("Insira o ano: ");
            int a = input.nextInt();
            l.setDate(d, m, a);
            bool = DateYMD.validDate(d,m,a);
        } while ( bool == false);
        Pessoa p = new Pessoa(nm,cc,l);
    }

}