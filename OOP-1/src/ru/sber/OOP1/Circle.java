package ru.sber.OOP1;


public class Circle {
    private int radius;
    private String color;
    public double area(){
        return radius*radius*Math.PI;
    }
    public double perimeter(){
        return radius*2*Math.PI;
    }
    Circle(int r,String c){
        radius = r;
        color = c;
    }

    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color +  ", area='" + area() +
                ", perimeter='" + perimeter() + '\'' + '}';
    }
}
