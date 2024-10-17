package P8;

public class Ligeiro extends Veiculo {
    int capacidadeBagageira;

    public Ligeiro(String matricula, String marca, String modelo, int potência, String numQuadro, int capacidadeBagageira) {
        super(matricula, marca, modelo, potência, numQuadro);
        this.capacidadeBagageira = capacidadeBagageira;
    }

    public int getCapacidadeBagageira() {
        return this.capacidadeBagageira;
    }

    public void setCapacidadeBagageira(int capacidadeBagageira) {
        this.capacidadeBagageira = capacidadeBagageira;
    }

}
