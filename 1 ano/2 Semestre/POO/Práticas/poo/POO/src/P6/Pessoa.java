package P6;
import P5.*;

public class Pessoa {
    String nome;
    int cc;
    DateYMD dataNascimento;

    public Pessoa(String nome, int cc, DateYMD dataNascimento) {
        this.nome = nome;
        this.cc = cc;
        this.dataNascimento = dataNascimento;
    }

    public int getCc() {
        return this.cc;
    }

    public String getNome() {
        return this.nome;
    }

    public DateYMD getDataNascimento() {
        return this.dataNascimento;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nC.C.: " + this.cc + "\nData de nascimento: " + this.dataNascimento.toString();
    }
}

public class Aluno extends Pessoa {

    int numMecanografico;
    DateYMD dataMatricula;

    public Aluno() {
        this.numMecanografico = numMecanografico;
        this.dataMatricula = dataMatricula;
    }

    int getNumMecanografico() {
        return this.numMecanografico;
    }

}