package galeria;

class Obra {
    private static int proximoId = 33;
    private int id;
    private String nome;
    private String autor;
    private double preco;

    public Obra(String nome, String autor, double preco) {
        this.id = proximoId++;
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getAutor() {
        return this.autor;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Obra #%d: %s, Autor: %s, Preço Base: %.2f", id, nome, autor, preco);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Obra)) return false;
        Obra outraObra = (Obra) obj;
        return id == outraObra.id;
    }

    public int hashCode() {
        return Integer.hashCode(id);
    }
}