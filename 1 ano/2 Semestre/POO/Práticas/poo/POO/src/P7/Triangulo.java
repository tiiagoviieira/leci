package P7;

public class Triangulo extends Forma {

    double base;
    double altura;

    public Triangulo (double base, double altura, String cor) {
        super(base * 2, base * altura / 2, cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase () {
        return this.base;
    }

    public double getAltura () {
        return this.altura;
    }

    public void setBase (double base) {
        this.base = base;
    }

    public void setAltura (double altura) {
        this.altura = altura;
    }

}
