package P8;

public class Taxi extends Ligeiro{
    String numLicencia;

    public Taxi(String matricula, String marca, String modelo, int potência, String numQuadro, int capacidadeBagageira, String numLicencia) {
        super(matricula, marca, modelo, potência, numQuadro, capacidadeBagageira);
        this.numLicencia = numLicencia;
    }

    public String getNumLicencia() {
        return this.numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

}
