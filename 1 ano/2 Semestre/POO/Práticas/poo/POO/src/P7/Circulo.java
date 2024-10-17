package P7;

public class Circulo  extends Forma{
    double raio;

    public Circulo (double raio, String cor) {
        super(2 * Math.PI * raio, Math.PI * Math.pow(raio, 2), cor);
        this.raio = raio;
    }

    public double getRaio () {
        return this.raio;
    }

    public void setRaio (double raio) {
        this.raio = raio;
    }
}
