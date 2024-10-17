package P8;

class ProdutoGenerico implements Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public ProdutoGenerico(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
