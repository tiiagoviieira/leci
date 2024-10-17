package galeria;

class Quadro extends Obra {
    String tipoTinta;
    boolean seEmoldurada;
    String tamanhoTela;

    public Quadro(String nome, String autor, double precoBase, String tipoTinta, boolean seEmoldurada, String tamanhoTela) {
        super(nome, autor, precoBase);
        this.tipoTinta = tipoTinta;
        this.seEmoldurada = seEmoldurada;
        this.tamanhoTela = tamanhoTela;
    }

    public String getTipoTinta() {
        return this.tipoTinta;
    }

    public boolean isSeEmoldurada() {
        return this.seEmoldurada;
    }

    public String getTamanhoTela() {
        return this.tamanhoTela;
    }

    public void setTipoTinta(String tipoTinta) {
        this.tipoTinta = tipoTinta;
    }

}

