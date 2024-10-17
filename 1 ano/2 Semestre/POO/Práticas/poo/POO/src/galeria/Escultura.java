package galeria;

class Escultura extends Obra {
    String material;
    boolean peçaUnica;
    int quantidade;

    public Escultura(String nome, String autor, double precoBase, String material, boolean peçaUnica, int quantidade) {
        super(nome, autor, precoBase);
        this.material = material;
        this.peçaUnica = peçaUnica;
        this.quantidade = quantidade;
    }

    public String getMaterial() {
        return this.material;
    }

    public boolean getIfIsPeçaUnica() {
        return this.peçaUnica;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setIfIsPeçaUnica(boolean peçaUnica) {
        this.peçaUnica = peçaUnica;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}