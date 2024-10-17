package POO2324EPn;

public class Concert extends Event {

    String artista;
    String tipo = "Concert";


    public Concert (String name, String artista, int duracao) {
        super(name, duracao);
        this.artista = artista;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista (String artista) {
        this.artista = artista;
    }


    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Duração: " + this.duracao + ", Artista: " + this.artista + ", Tipo: " + this.tipo;
    }

}
