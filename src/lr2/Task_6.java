package lr2;

import java.io.IOException;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

public class Task_6{
    public static void main(String[] args) throws IOException{
        Circle circle = new Circle(5f);
        Square square = new Square(5f);
        Triangle triangle = new Triangle(3f,4f,5f);
        List<? extends Geom> arr = new ArrayList<>(){{add(circle); add(square); add(triangle);}};
        System.out.println("Периметры фигур: ");
        arr.forEach(e -> System.out.println(e.getName() + ": " + e.getPerimeter()));
        System.out.println("Площади фигур: ");
        arr.forEach(e -> System.out.println(e.getName() + ": " + e.getSquare()));


    }
}

interface Geom{
    Float getSquare();
    Float getPerimeter();
    String getName();
}

class Circle implements Geom{
    Float radius;
    String name = "Circle";
    Circle(Float radius){
        this.radius = radius;
    }

    @Override
    public Float getSquare() {
        return (float)(Math.PI*Math.pow(radius, 2));
    }

    @Override
    public Float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public String getName() {
        return name;
    }
}
class Square implements Geom{
    Float width;
    String name = "Square";
    Square(Float width){
        this.width = width;
    }

    @Override
    public Float getSquare() {
        return (float) Math.pow(width, 2);
    }

    @Override
    public Float getPerimeter() {
        return 4*width;
    }

    @Override
    public String getName() {
        return name;
    }
}
class Triangle implements Geom{
    Float side_1;
    Float side_2;
    Float side_3;
    String name = "Triangle";

    Triangle(Float side_1, Float side_2, Float side_3) throws IOException {
        if (side_1 < side_2+side_3 && side_2 < side_1+side_3 && side_3 < side_1+side_2){
            this.side_1 = side_1;
            this.side_2 = side_2;
            this.side_3 = side_3;
        }
        else throw new IOException("Не выполняется условие сущестовавания треугольника");
    }

    @Override
    public Float getSquare() {
        Float p = getPerimeter()/2;
        return (float) Math.sqrt(p*(p-side_1)*(p-side_2)*(p-side_3));
    }

    @Override
    public Float getPerimeter() {
        return side_1+side_2+side_3;
    }

    @Override
    public String getName() {
        return name;
    }
}
