package P8;

public class pesadoMercaderias extends Veiculo {
    int peso;
    int cargaMaxima;

    public pesadoMercaderias(String matricula, String marca, String modelo, int potência, String numQuadro, int peso, int cargaMaxima) {
        super(matricula, marca, modelo, potência, numQuadro);
        this.peso = peso;
        this.cargaMaxima = cargaMaxima;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
