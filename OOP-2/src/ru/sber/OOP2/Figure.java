package ru.sber.OOP2;

abstract public class Figure implements Drawable {
    Point p;
    public Figure(Point p){
        this.p = p;
    }
    public abstract double area();
    public abstract double perimeter();
}
