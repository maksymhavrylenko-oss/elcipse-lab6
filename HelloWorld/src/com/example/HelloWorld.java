package com.example;

// Версія для гілки feature/greeting (крок 5 інструкції):
// замінити вміст HelloWorld.java на цей код.
public class HelloWorld {

    static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(greet("Eclipse IDE"));
        System.out.println("Java version: " + System.getProperty("java.version"));
    }
}
