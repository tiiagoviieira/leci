package P9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + '}';
    }

    public static void main(String[] args) {
        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Matheus"));
        c3.add(new Pessoa("Tiago"));
        c3.add(new Pessoa("Henrique"));
        c3.add(new Pessoa("Laredo"));
        c3.add(new Pessoa("Matheus"));

        Iterator<Pessoa> iterator = c3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
