package POO2324EPn;

public class Event {

    String nome;
    int duracao;
    String tipo = "Generico";

    public Event (String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return this.nome;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Duração: " + this.duracao + ", Tipo: " + this.tipo;
    }

}
