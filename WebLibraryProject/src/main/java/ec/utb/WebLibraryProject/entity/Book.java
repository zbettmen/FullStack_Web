package ec.utb.WebLibraryProject.entity;

import javax.persistence.*;
import java.util.Objects;

//Author: Benjamin Boson & Lukas Rasmussen
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private int maxLoanDays;
    @Column(unique = true)
    private String title;
    private String author;
    private boolean isAvailable;
    private boolean isReserved;

    public Book() {
    }

    public Book(int maxLoanDays, String title, String author){
        this.maxLoanDays = maxLoanDays;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public int getMaxLoanDays() {
        return maxLoanDays;
    }

    public void setMaxLoanDays(int maxLoanDays) {
        this.maxLoanDays = maxLoanDays;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId &&
                maxLoanDays == book.maxLoanDays &&
                isAvailable == book.isAvailable &&
                isReserved == book.isReserved &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, maxLoanDays, title, author, isAvailable, isReserved);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", maxLoanDays=" + maxLoanDays +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                ", isReserved=" + isReserved +
                '}';
    }
}
