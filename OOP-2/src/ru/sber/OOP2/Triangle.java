package ru.sber.OOP2;


public class Triangle extends Figure{
    Point p2, p3;
    public Triangle(Point p, Point p2, Point p3){
        super(p);
        this.p2 = p2;
        this.p3 = p3;
    }
    public double perimeter(){
        return Math.sqrt(Math.pow(p2.x-p.x,2)+Math.pow(p2.y-p.y,2))+Math.sqrt(Math.pow(p3.x-p2.x,2)+Math.pow(p3.y-p2.y,2))
                +Math.sqrt(Math.pow(p.x-p3.x,2)+Math.pow(p.y-p3.y,2));
    }
    public double area() {
        double poluPer = perimeter() / 2;
        return Math.sqrt(poluPer * (poluPer - Math.sqrt(Math.pow(p2.x - p.x, 2) + Math.pow(p2.y - p.y, 2)))
                * (poluPer - Math.sqrt(Math.pow(p3.x - p2.x, 2) + Math.pow(p3.y - p2.y, 2)))
                * (poluPer - Math.sqrt(Math.pow(p.x - p3.x, 2) + Math.pow(p.y - p3.y, 2))));
    }
    public void draw(){
        System.out.println("Нарисован треугольник с вершинами "+p.x+" "+p.y+", "+p2.x+" "+p2.y+", "+p3.x+" "+p3.y);
    }
    public void draw(Color color){
        String colors = switch (color){
            case RED -> "красный";
            case BLUE -> "синий";
            case GREEN -> "зелёный";
            case BLACK -> "чёрный";
            case WHITE -> "белый";
        };
        System.out.println("Нарисован "+colors+" треугольник с вершинами"+p.x+" "+p.y+", "+p2.x+" "+p2.y+", "+p3.x+" "+p3.y);
    }
}
