package P8;

public class notMain {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeComprasImpl();

        Produto produto1 = new ProdutoGenerico("Camiseta", 2, 25.0);
        Produto produto2 = new ProdutoComDescontoImpl("Calça Jeans", 1, 50.0, 10.0);

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        System.out.println("Total da compra: R$" + carrinho.calcularTotal());
    }
}