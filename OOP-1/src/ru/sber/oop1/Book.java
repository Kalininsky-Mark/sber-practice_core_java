package ru.sber.oop1;



public class Book {
    private int year;
    private Author author;
    Book(int y, Author a){
        year = y;
        author = a;
    }
    public void setYear(int y){
        this.year = y;
    }
    public void setAuthor(Author a){
        this.author = a;
    }
    public int getYear() {
        return year;
    }
    public Author getAuthor() {
        return author;
    }

    public String toString() {
        return "Book{" + "year=" + year + ", author=" + author + '}';
    }
}
