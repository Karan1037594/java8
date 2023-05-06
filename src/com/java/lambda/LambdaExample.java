package com.java.lambda;

interface Shape{
    void draw();
    default void m1(){
        System.out.println("m1 method");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle class : draw() Method");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class : draw() Method");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class : draw() Method");
    }
}
public class LambdaExample {
    public static void main(String[] args) {
        Shape rectangle = () -> System.out.println("Rectangle class : draw() Method");
        // rectangle.draw();

        Shape square = () -> System.out.println("Square class : draw() Method");
        // square.draw();

        Shape circle = () -> System.out.println("Circle class : draw() Method");
        // circle.draw();

        print(rectangle);
        print(square);
        print(circle);
    }

    private static void print(Shape shape){
        shape.draw();
    }
}
