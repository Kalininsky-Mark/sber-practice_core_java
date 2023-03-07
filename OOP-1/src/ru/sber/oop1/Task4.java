package ru.sber.oop1;

public class Task4 {
    public static void main(String[] args){
        Author author = new Author("Лев","мужской","Tolstoy.Lev@yandex.ru");
        Book book = new Book(1873,author);
        System.out.println(author.toString());
        System.out.println(book.toString());
        author.setName("Анна");
        author.setGender("женский");
        author.setEmail("Ahmatova.Elizaveta@yandex.ru");
        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println(author.getEmail());
        book.setYear(1912);
        book.setAuthor(author);
        System.out.println(book.getYear());
        System.out.println(book.getAuthor());
    }
}
