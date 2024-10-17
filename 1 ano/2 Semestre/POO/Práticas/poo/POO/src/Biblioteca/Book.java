package Biblioteca;

import java.util.Objects;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book {
    static int nextId = 1;
    String title;
    String author;
    String editora;
    String isbn;
    LocalDate localDate;
    int id;

    public Book(String title, String author, String editora, String isbn, String localDate) {
        this.id = nextId++;
        this.title = title;
        this.author = author;
        this.editora = editora;
        this.isbn = isbn;   
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(localDate, formatter);
        this.localDate = date;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getEditora() {
        return this.editora;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public LocalDate getLocalDate() {
        return this.localDate;
    }

    public int getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean equals(Book book) {
        if (book.getTitle() == this.title && book.getAuthor() == this.author && book.getEditora() == this.editora && book.getIsbn() == this.isbn && book.getLocalDate() == this.localDate && book.getId() == this.id) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nEditora: " + this.editora + "\nISBN: " + this.isbn + "\nData de locação: " + this.localDate + "\nID: " + this.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(isbn, title.toLowerCase());
    }
}
