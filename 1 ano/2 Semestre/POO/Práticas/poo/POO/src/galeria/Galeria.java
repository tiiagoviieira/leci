package galeria;

import java.util.ArrayList;
import java.util.List;

class Galeria {
    List<Obra> obras;
    double lucroTotal;

    public Galeria() {
        this.obras = new ArrayList<>();
        this.lucroTotal = 0;
    }

    public void adicionarObra(Obra obra) {
        obras.add(obra);
    }

    public void listarObras() {
        for (Obra obra : obras) {
            System.out.println(obra);
        }
    }

    public void venderObra(int id, double precoVenda) {
        for (Obra obra : obras) {
            if (obra.equals(new Obra("", "", id))) {
                double lucro = precoVenda - obra.getPreco();
                System.out.println("Obra vendida: " + obra);
                System.out.println("Preço de venda: " + precoVenda);
                System.out.println("Lucro: " + lucro);
                obras.remove(obra);
                this.lucroTotal += lucro;
                return;
            }
        }
        System.out.println("Obra não encontrada com o ID: " + id);
    }

    public double calcularLucroTotal() {
        return this.lucroTotal; 
    }
}