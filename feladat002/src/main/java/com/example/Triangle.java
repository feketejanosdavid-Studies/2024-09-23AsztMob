package com.example;

public class Triangle implements Shape {
    double base;
    double height;

    double aSide;
    double bSide;
    double cSide;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (base * height) / 2;
    }

    @Override
    public double calcPerimeter() {
        return aSide + bSide + cSide;
    }
}
