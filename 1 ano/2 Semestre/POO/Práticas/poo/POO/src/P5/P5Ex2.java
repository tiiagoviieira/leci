package P5;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

import P3.*;

public class P5Ex2 {

    public static void main(String[] args) {
        Calendar calendar = new Calendar(2,1);
        calendar.makeEvent();
    }

}

class Calendar {

    public static ArrayList <Evento> events = new ArrayList<>();
    int ano;
    int diaDaSemana;
    int mes;

    public Calendar ( int ano, int diaDaSemana) {
        this.ano = ano;
        this.diaDaSemana = diaDaSemana;
    }

    public int year () {
        return this.ano;
    }

    public String firstWeekdayOfYear () {
        return this.diaDaSemana + " - " + sayDayOfWeekend(diaDaSemana);
    }

    public void makeArrayOfYear () {
    }

    public void makeEvent () {
        Evento evento = new Evento();
        events.add(evento);
    }

    class Evento {

        int dia, mes, ano;
        String horasInicio, horasFim, descricao;
        public Evento() {
            int dia, mes, ano;
            Scanner input = new Scanner(System.in);
            boolean valid = false;
            do {
                System.out.println("Insira o ano do evento!");
                ano = input.nextInt();
                System.out.println("Insira o mes do evento!");
                mes = input.nextInt();
                System.out.println("Insira o dia do evento!");
                dia = input.nextInt();
                if (DateYMD.validDate(dia, mes, ano)) {
                    this.ano = ano;
                    this.mes = mes;
                    this.ano = ano;
                    valid = true;
                    System.out.println("Insira a hora do evento Ex ( 13:50 ) ");
                    this.horasInicio = input.nextLine();
                    System.out.println("Insira a hora que o evento acaba Ex ( 15:50 ) ");
                    this.horasFim = input.nextLine();
                    System.out.println("Faça a descrição do evento ");
                    this.descricao = input.nextLine();
                }
            } while (valid == false);
            input.close();
        }

        public String toString () {
            return "Data: " + dia + " | " + mes + " | " + ano + "\nHorário : " + horasInicio + " - " + horasFim + "\nDescrição:\n" + descricao;
        }
    }

        public int firstWeekdayOfMonth(int mes) {
        int num = 0;

        for (int i = 1; i < mes; i++) {
            num += DateYMD.monthDays(mes, this.ano);
        }

        int newNum = Math.round(num / 7) + this.diaDaSemana;
        newNum = newNum + (num % 7);

        return newNum;
    }


    public String sayDayOfWeekend (int diaDaSemana) {

        String nomeDia = "";

        switch (diaDaSemana) {

            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                break;

        }

        return nomeDia;

    }

    public void printMes () {
        P3Ex5.printCalendar(mes, ano, diaDaSemana);
    }

}

