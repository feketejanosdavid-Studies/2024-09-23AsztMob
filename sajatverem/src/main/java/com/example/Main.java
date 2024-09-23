package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Sajatverem<Integer> verem = new Sajatverem<>(10);
        verem.push(1);
        verem.push(2);
        verem.push(3);
        System.out.println(verem.pop());
        System.out.println(verem.pop());
    }
}