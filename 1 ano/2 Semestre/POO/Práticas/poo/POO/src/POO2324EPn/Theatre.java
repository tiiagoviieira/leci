package POO2324EPn;

public class Theatre extends Event {

    String autor;
    String campanhiaTeatro;
    String tipo = "Theatre";

    public Theatre (String name, String autor, String campanhiaTeatro, int duracao) {
        super(name, duracao);
        this.autor = autor;
        this.campanhiaTeatro = campanhiaTeatro;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor (String autor) {
        this.autor = autor;
    }

    public String getCampanhiaTeatro() {
        return this.campanhiaTeatro;
    }

    public void setCampanhiaTeatro (String campanhiaTeatro) {
        this.campanhiaTeatro = campanhiaTeatro;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Duração: " + this.duracao + ", Autor: " + this.autor + ", Tipo: " + this.tipo + ", Campanhia Teatro: " + this.campanhiaTeatro;
    }

}
