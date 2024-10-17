package Biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class BookManager {

    Map<Integer, Book> books;
    IBookCostCalculator calculator;

    public BookManager(IBookCostCalculator calculator) {
        this.books = new HashMap<>();
        this.calculator = calculator;
    }

    public boolean addBook(Book book) {
        if (!books.containsValue(book)) {
            books.put(book.getId(), book);
            return true;
        }
        return false;
    }

    public void removeBook(int id) {
        books.remove(id);
    }

    public Book getBook(int id) {
        return books.get(id);
    }

    public void printAllBooks() {
        for (Book b : books.values()) {
            System.out.println(b);
        }
    }

    public double calculateBookLoanCost(int dias, int id) {
        if (books.containsKey(id)) {
            return calculator.calculateCost(dias);
        }
        return -1;
    }

    public void readFile(String fileName) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            BufferedReader sc = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = sc.readLine())!= null) {
                String[] parts = line.split(",");
                LocalDate date = LocalDate.parse(parts[4], formatter);
                Book b = new Book(parts[0], parts[1], parts[2], parts[3], date.format(formatter));
                addBook(b);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }

    public void writeFile(String fileName) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            BufferedWriter sc = new BufferedWriter(new FileWriter(fileName));
            for (Book b : books.values()) {
                sc.write(b.getTitle() + "\t" + b.getAuthor() + "\t" + b.getEditora() + "\t" + b.getIsbn() + "\t" + b.getLocalDate().format(formatter) + "\n");
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }

}
