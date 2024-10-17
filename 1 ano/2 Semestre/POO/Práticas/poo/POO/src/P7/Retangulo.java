package P7;

public class Retangulo extends Forma{
    double comprimento;
    double altura;

    public Retangulo (double comprimento, double altura, String cor) {
        super((comprimento * 2) + (altura * 2), comprimento * altura, cor);
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public double getComprimento () {
        return this.comprimento;
    }

    public double getAltura () {
        return this.altura;
    }

    public void setComprimento (double comprimento) {
        this.comprimento = comprimento;
    }

    public void setAltura (double altura) {
        this.altura = altura;
    }

}
