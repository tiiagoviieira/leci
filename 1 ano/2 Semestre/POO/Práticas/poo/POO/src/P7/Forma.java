package P7;

public class Forma {

    double perimetro;
    double area;
    String cor;

    public Forma(double perimetro, double area, String cor) {
        this.perimetro = perimetro;
        this.area = area;
        this.cor = cor;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public double getArea() {
        return this.area;
    }

    public String getCor() {
        return this.cor;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String equals(Forma comparador) {
        if (this.area == comparador.getArea() && this.perimetro == comparador.getPerimetro() && this.cor == comparador.getCor()) {
            return "São iguais";
        } else {
            return "São diferentes";
        }
    }

    @Override
    public String toString() {
        return "Forma [ perimetro : " + perimetro + " area : " + area + " cor : " + cor + " ]";
    }
}
