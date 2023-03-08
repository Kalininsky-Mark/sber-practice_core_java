package ru.sber.OOP2;

public class FigureUtil{
    private static Figure figure;
    private FigureUtil(Figure figure){
        this.figure = figure;
    }
    public static double area(Figure figure1){
        return figure1.area();
    }
    public static double perimeter(Figure figure1){
        return figure1.perimeter();
    }
    public static void draw(Figure figure1){
        figure1.draw();
    }
    public static void draw(Figure figure1, Color color){
        figure1.draw(color);
    }
}
