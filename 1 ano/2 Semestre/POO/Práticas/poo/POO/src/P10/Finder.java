package P10;

import java.util.*;

public class Finder {

    TreeMap<String, List<Book>> books;

    public Finder() {
        books = new TreeMap<>();
    }

    public void addTipoBook (String tipo, Book book) {
        if (!books.containsKey(tipo)) {
            books.put(tipo, new ArrayList<>());
        }
        books.get(tipo).add(book);
    }

    public void removeTipoBook (String tipo) {
        books.remove(tipo);
    }

    public void changeTipoBook (String tipo, List<Book> book) {
        books.replace(tipo, book);
    }

    @Override
    public String toString() {
        return "Books: " + books;
    }

    public void printTipos () {
        for (String tipo : books.keySet()) {
            System.out.println(tipo);
        }
    }

    public void printBooks () {
        for (List<Book> books : books.values()) {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public Book getRandomBook(String tipo) {
        List<Book> books2 = books.get(tipo);
        if (books2 != null && !books2.isEmpty()) {
            Random random = new Random();
            return books2.get(random.nextInt(books2.size()));
        }
        return null;
    }

    public static void main(String[] args) {
        Finder Finder = new Finder();

        //Esta parte era so para testar ent e copiado :)
        Finder.addTipoBook("Drama", new Book("Hamlet", "William Shakespeare", 1603));
        Finder.addTipoBook("Fantasia", new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        Finder.addTipoBook("Ficção Cientifica", new Book("Dune", "Frank Herbert", 1965));
        Finder.addTipoBook("Mistério", new Book("The Hound of the Baskervilles", "Arthur Conan Doyle", 1902));
        Finder.addTipoBook("Non-Fiction", new Book("Sapiens", "Yuval Noah Harari", 2011));

        System.out.println("Todos os pares de tipos/livros:");
        System.out.println(Finder);
        System.out.println("Tipos:");
        Finder.printTipos();
        System.out.println("Livros:");
        Finder.printBooks();

        String tipoLivro = "Drama";
        Book random = Finder.getRandomBook(tipoLivro);
        if (random != null) {
            System.out.println("Livro aleatório " + tipoLivro + ": " + random);
        } else {
            System.out.println("Tipo não possui livros " + tipoLivro);
        }
    }

}
