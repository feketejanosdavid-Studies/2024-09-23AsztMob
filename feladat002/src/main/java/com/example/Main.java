package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Háromszög kerület, terület");
        Triangle triangle = new Triangle(3, 4);
        System.out.println(triangle.calcArea());

        Triangle triangle2 = new Triangle(3, 5, 6);
        System.out.println(triangle2.calcPerimeter());
    }
}