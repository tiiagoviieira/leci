
package POO2324EPn;

public class Cinema extends Event {

    String realizador;
    int ano;
    String [] atores;
    String tipo = "Cinema";

    public Cinema (String name, String realizador, int ano, String [] atores, int duracao) {
        super(name, duracao);
        this.realizador = realizador;
        this.ano = ano;
        this.atores = atores;
    }

    public String getRealizador() {
        return this.realizador;
    }

    public void setRealizador (String realizador) {
        this.realizador = realizador;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno (int ano) {
        this.ano = ano;
    }

    public String[] getAtores() {
        return this.atores;
    }

    public void setAtores (String [] atores) {
        this.atores = atores;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Duração: " + this.duracao + ", Realizador: " + this.realizador + ", Ano: " + this.ano + ", Tipo: " + this.tipo + ", \nAtores: " + this.atores;
    }

}
