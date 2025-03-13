package lr2;

import java.io.IOException;

public class Task_8_2 {
    public static void main(String[] args) throws IOException{
        Circle_2 circle = new Circle_2(5d);
        System.out.println("Периметр круга: " + circle.getPerimeter() + "\nПлощадь круга: " + circle.getSquare());
        Triangle_2 triangle = new Triangle_2(3d,4d,5d);
        System.out.println("Периметр треугольника: " + triangle.getPerimeter() + "\nПлощадь треугольника: " + triangle.getSquare());

    }
}



abstract class Shape{
    abstract Double getPerimeter();
    abstract Double getSquare();
}

class Circle_2 extends Shape{
    Double radius;

    Circle_2(Double radius){
        this.radius = radius;
    }

    @Override
    Double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    Double getPerimeter() {
        return 2*Math.PI*radius;
    }
}

class Triangle_2 extends Shape{
    Double a,b,c;

    Triangle_2(Double a, Double b, Double c) throws IOException {
        if (a < b+c && b < a+c && c < a+b){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else throw new IOException("Не выполняется условие сущестовавания треугольника");
    }

    @Override
    Double getPerimeter() {
        return a+b+c;
    }

    @Override
    Double getSquare() {
        Double p = getPerimeter()/2;
        return  Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}