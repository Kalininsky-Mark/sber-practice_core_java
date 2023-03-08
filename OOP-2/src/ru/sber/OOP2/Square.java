package ru.sber.OOP2;

public class Square extends Figure{
    Point p3;
    Point p2 = new Point(0.0, 0.0);
    Point p4 = new Point(0.0, 0.0);
    public Square(Point p, Point p3){
        super(p);
        this.p3 = p3;
        this.p2.y = p.y;
        this.p2.x = p3.x;
        this.p4.y = p3.y;
        this.p4.x = p.x;
    }
    public double area(){
        return Math.pow(p2.x-p.x,2)+Math.pow(p2.y-p.y,2);
    }

    public double perimeter() {
        return Math.sqrt(Math.pow(p2.x-p.x,2)+Math.pow(p2.y-p.y,2))*4;
    }
    public void draw(){
        System.out.println("Нарисован квадрат с вершинами "+p.x+" "+p.y+", "+p2.x+" "+p2.y+", "+p3.x+" "+p3.y
                +", "+p4.x+" "+p4.y);
    }
    public void draw(Color color){
        String colors = switch (color){
            case RED -> "красный";
            case BLUE -> "синий";
            case GREEN -> "зелёный";
            case BLACK -> "чёрный";
            case WHITE -> "белый";
        };
        System.out.println("Нарисован "+colors+" квадрат с вершинами "+p.x+" "+p.y+", "+p2.x+" "+p2.y+", "+p3.x+" "+p3.y
                +", "+p4.x+" "+p4.y);
    }
}
