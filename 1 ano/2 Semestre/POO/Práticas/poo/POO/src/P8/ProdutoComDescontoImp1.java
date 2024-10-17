package P8;

class ProdutoComDescontoImpl extends ProdutoGenerico implements ProdutoComDesconto {
    private double desconto;

    public ProdutoComDescontoImpl(String nome, int quantidade, double preco, double desconto) {
        super(nome, quantidade, preco);
        this.desconto = desconto;
    }

    @Override
    public double getDesconto() {
        return desconto;
    }
}