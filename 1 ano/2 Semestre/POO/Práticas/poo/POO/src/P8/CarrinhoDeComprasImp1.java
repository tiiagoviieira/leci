package P8;
import java.util.ArrayList;
import java.util.List;

class CarrinhoDeComprasImpl implements CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeComprasImpl() {
        produtos = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }
}

