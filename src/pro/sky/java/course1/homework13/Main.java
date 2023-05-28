package pro.sky.java.course1.homework13;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");
        System.out.println("");

        Author authorBook1 = new Author("Михаил ", "Лермонтов");
        Author authorBook2 = new Author("Михаил ", "Булгаков");

        Book book1 = new Book("Герой нашего времени", authorBook1, 1840);
        System.out.println("Название книги: " + book1.getNameBook());
        System.out.println("Автор книги: " + authorBook1.getAuthorBook());
        System.out.println("Год публикации книги: " + book1.getYearPublishingBook());
        book1.setYearPublishingBook(1850);
        System.out.println("Год публикации книги измененный: " + book1.getYearPublishingBook());

        System.out.println("=====================================");

        Book book2 = new Book("Собачье сердце", authorBook2,1925);
        System.out.println("Название книги: " + book2.getNameBook());
        System.out.println("Автор книги: " + authorBook2.getAuthorBook());
        System.out.println("Год публикации книги: " + book2.getYearPublishingBook());
    }
    }