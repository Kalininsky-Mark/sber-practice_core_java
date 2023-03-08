package ru.sber.OOP2;


public class Circle extends Figure {
    double r;
    public Circle(double r, Point p){
        super(p);
        this.r = r;
    }
    public double area(){
        return Math.PI*r*r;
    }
    public double perimeter(){
        return Math.PI*r*2;
    }
    public void draw(){
        System.out.println("Нарисован круг радисуа "+r+" с центром в точке"+p.x+" "+p.y);
    }
    public void draw(Color color){
        String colors = switch (color){
            case RED -> "красный";
            case BLUE -> "синий";
            case GREEN -> "зелёный";
            case BLACK -> "чёрный";
            case WHITE -> "белый";
        };
        System.out.println("Нарисован "+colors+"круг радисуа "+r+" с центром в точке"+p.x+" "+p.y);
    }
}
