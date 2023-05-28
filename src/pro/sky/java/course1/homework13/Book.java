package pro.sky.java.course1.homework13;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author authorBook;
    private int yearPublishingBook;

    public Book(String nameBook, Author authorBook, int yearPublishingBook) {
        this.nameBook = nameBook;
        this.yearPublishingBook = yearPublishingBook;
        this.authorBook = authorBook;
    }
    public String getNameBook(){
        return this.nameBook;
    }

    public int getYearPublishingBook() {
        return this.yearPublishingBook;
    }

    public Author getAuthorBook() {
        return this.authorBook;
    }
    public void setYearPublishingBook(int yearPublishingBook) {
        this.yearPublishingBook = yearPublishingBook;
    }
    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", authorBook=" + authorBook +
                ", yearPublishingBook=" + yearPublishingBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishingBook == book.yearPublishingBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(authorBook, book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorBook, yearPublishingBook);
    }
}