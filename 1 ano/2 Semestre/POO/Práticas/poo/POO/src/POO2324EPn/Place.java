package POO2324EPn;

public class Place {

    String nome;
    int capacidade;

    public Place (String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Capacidade: " + this.capacidade;
    }
    
}
