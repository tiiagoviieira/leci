package P8;

public class pesadoPassageiros extends Veiculo {
    int peso;
    int numPessoas;
    
    public pesadoPassageiros(String matricula, String marca, String modelo, int potência, String numQuadro, int peso, int numPessoas) {
        super(matricula, marca, modelo, potência, numQuadro);
        this.peso = peso;
        this.numPessoas = numPessoas;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getNumPessoas() {
        return this.numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

}
