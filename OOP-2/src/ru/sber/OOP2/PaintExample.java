package ru.sber.OOP2;

public class PaintExample {
    public static void main(String[] args){
        Point point = new Point(0.0, 0.0);
        Circle circle = new Circle(2.0, point);
        Color color1 = Color.RED;
        System.out.println("Площадь:");
        System.out.println(FigureUtil.area(circle));
        System.out.println("Периметр:");
        System.out.println(FigureUtil.perimeter(circle));
        System.out.println();
        FigureUtil.draw(circle);
        System.out.println();
        FigureUtil.draw(circle, color1);
        System.out.println();

        Point point2 = new Point(1.0, 0.0);
        Point point3 = new Point(0.0, 1.0);
        Triangle triangle = new Triangle(point, point2, point3);
        Color color2 = Color.GREEN;
        System.out.println("Площадь:");
        System.out.println(FigureUtil.area(triangle));
        System.out.println("Периметр:");
        System.out.println(FigureUtil.perimeter(triangle));
        System.out.println();
        FigureUtil.draw(triangle);
        System.out.println();
        FigureUtil.draw(triangle, color2);
        System.out.println();

        Point point4 = new Point(1.0, 1.0);
        Rectangle rectangle = new Rectangle(point, point4);
        Color color3 = Color.BLACK;
        System.out.println("Площадь:");
        System.out.println(FigureUtil.area(rectangle));
        System.out.println("Периметр:");
        System.out.println(FigureUtil.perimeter(rectangle));
        System.out.println();
        FigureUtil.draw(rectangle);
        System.out.println();
        FigureUtil.draw(rectangle, color3);
        System.out.println();

        Square square = new Square(point, point4);
        Color color4 = Color.WHITE;
        System.out.println("Площадь:");
        System.out.println(FigureUtil.area(square));
        System.out.println("Периметр:");
        System.out.println(FigureUtil.perimeter(square));
        System.out.println();
        FigureUtil.draw(square);
        System.out.println();
        FigureUtil.draw(square, color4);
        System.out.println();
    }
}
