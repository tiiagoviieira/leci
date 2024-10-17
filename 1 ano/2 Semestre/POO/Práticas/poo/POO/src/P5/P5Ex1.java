package P5;

import java.util.ArrayList;
import java.util.Scanner;

public class P5Ex1 {

    private final static ArrayList <DateYMD> listaDatas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir nova Data");
            System.out.println("2. Redefenir uma Data");
            System.out.println("3. Obter um dos valores de uma Data ( ano , dia , mês )");
            System.out.println("4. Incrementar Data");
            System.out.println("5. Decrementar Data");
            System.out.println("6. Print de todas as Datas");
            System.out.println("0. Sair");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("Insira o ano: ");
                    int Ano = input.nextInt();
                    System.out.print("\nInsira o mes: ");
                    int Mes = input.nextInt();
                    System.out.println("\nInsira o dia: ");
                    int Dia = input.nextInt();
                    final DateYMD data = new DateYMD(Dia, Mes, Ano);
                    System.out.println("Data inserida: " + data);
                    listaDatas.add(data);
                    break;
                case 2:
                    printList();
                    System.out.println("Insira o numero da data que pretende redefinir: ");
                    int index = input.nextInt();
                    System.out.print("Insira o novo ano");
                    int newAno = input.nextInt();
                    System.out.print("Insira o novo mes: ");
                    int newMes = input.nextInt();
                    System.out.println("Insira o novo dia:");
                    int newDia = input.nextInt();
                    listaDatas.get(index).setDate(newDia, newMes, newAno);
                    System.out.println("Data redefenida: " + listaDatas.get(index));
                    break;
                case 3:
                    printList();
                    System.out.println("Insira o numero da data que pretende os valores: ");
                    index = input.nextInt();
                    System.out.println("Qual valor deseja obter? \n1 - Ano\n2 - Mês\n3 - Dia");
                    int escolhaValor = input.nextInt();
                    switch (escolhaValor) {
                        case 1 :
                            System.out.println(listaDatas.get(index).getAno());
                        case 2 :
                            System.out.println(listaDatas.get(index).getMes());
                        case 3 :
                            System.out.println(listaDatas.get(index).getDia());
                    }
                    break;
                case 4:
                    printList();
                    System.out.println("Insira o numero da data que pretende incrementar: ");
                    index = input.nextInt();
                    System.out.println("O que você pretender incrementar? \n1 - Ano\n2 - Mês\n3 - Dia");
                    escolhaValor = input.nextInt();
                    listaDatas.get(index).incrementDate(escolhaValor);
                    break;
                case 5:
                    printList();
                    System.out.println("Insira o numero da data que pretende decrementar: ");
                    index = input.nextInt();
                    System.out.println("O que você pretender decrementar? \n1 - Ano\n2 - Mês\n3 - Dia");
                    escolhaValor = input.nextInt();
                    listaDatas.get(index).decrementDate(escolhaValor);
                    break;
                case 6 :
                    printList();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);

        input.close();
    }

    public static void printList () {
        for (int i = 1; i <= listaDatas.size(); i++) {
            System.out.println(i + " - " + listaDatas.get(i-1));
        }
    }

}

