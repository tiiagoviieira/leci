package P5;

import P3.P3Ex5;

public class DateYMD {

    int dia;
    int mes;
    int ano;

    public DateYMD( int dia , int mes, int ano ) {
        if (!validDate(dia, mes, ano)) {
            System.out.println("Data inválida");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public static boolean validMonth (int mes) {
        if ( mes >= 1 && mes <= 12) {
            return true;
        } else {
            return false;
        }
    }

    public static int monthDays ( int mes , int ano) {
        return P3Ex5.getDiasNoMes(mes, ano);
    }

    public boolean leapYear ( int ano ) {
        if( ano%4 == 0 ) {
            if( ano%100 == 0 ) {
                if( ano%400 == 0 )
                    return true;
                else
                    return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean validDate (int dia, int mes, int ano) {
        if(validMonth(mes) && dia > 0 && dia <= monthDays(mes, ano)) {
            return true;
        } else {
            return false;
        }
    }

    public void setDate (int dia, int mes, int ano) {
        if (validDate(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void incrementDate ( int choise ) {
        if (choise == 1) {
            dia++;
            if(!validDate(dia, mes, ano)) {
                if (dia > P3Ex5.getDiasNoMes(mes, ano)) {
                    dia = 1;
                    mes++;
                }
                if(mes > 12) {
                    mes = 1;
                    ano++;
                }
            }
        } else if (choise == 2) {
            mes++;
            if(!validDate(dia, mes, ano)) {
                if (mes > 12) {
                    mes = 1;
                    ano++;
                } else if ( mes == 2 && leapYear(ano)) {
                    if ( dia > 29) {
                        mes--;
                        System.out.println("Ação Impossivel");
                    }
                } else if ( mes == 2 && !leapYear(ano)) {
                    if (dia > 28) {
                        mes--;
                        System.out.println("Ação Impossivel");
                    }
                }
            }
        } else if (choise == 3) {
            ano++;
            if (!validDate(dia, mes, ano)) {
                ano--;
                System.out.println("Ação Impossivel");
            }
        } else {
            System.out.println("Nenhuma opção escolhida ou opção inválida!");
        } 
    }

    public void decrementDate ( int choise ) {
        if (choise == 1) {
            dia--;
            if(!validDate(dia, mes, ano)) {
                if (dia < 0) {
                    if (mes == 1) {
                        mes = 12;
                        ano--;
                        dia = P3Ex5.getDiasNoMes(mes, ano);
                    } else {
                        mes--;
                        dia = P3Ex5.getDiasNoMes(mes, ano);
                    }
                }
            }
        } else if (choise == 2) {
            mes--;
            if(!validDate(dia, mes, ano)) {
                if (mes < 1) {
                    mes = 1;
                    ano--;
                } 
                if (P3Ex5.getDiasNoMes(mes, ano) < dia ) {
                    mes ++;
                    System.out.println("Ação Impossivel");
                }
            }
        } else if (choise == 3) {
            ano--;
            if (!validDate(dia, mes, ano)) {
                ano++;
                System.out.println("Ação Impossivel");
            }
        }  else {
            System.out.println("Nenhuma opção escolhida ou opção inválida!");
        }
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

}

