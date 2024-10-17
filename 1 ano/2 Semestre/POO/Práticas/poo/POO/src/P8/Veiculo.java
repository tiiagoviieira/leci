package P8;

public class Veiculo {
    String matricula;
    String marca;
    String modelo;
    int potência;
    String numQuadro;

    Veiculo(String matricula, String marca, String modelo, int potência, String numQuadro) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potência = potência;
        this.numQuadro = numQuadro;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getPotência() {
        return this.potência;
    }

    public String getNumQuadro() {
        return this.numQuadro;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotência(int potência) {
        this.potência = potência;
    }

    public void setNumQuadro(String numQuadro) {
        this.numQuadro = numQuadro;
    }

    public String toString() {
        return("Matricula: " + this.matricula + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nPotência: " + this.potência + "\nNúmero de Quadros: " + this.numQuadro);
    }

}
