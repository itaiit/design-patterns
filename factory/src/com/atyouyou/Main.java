package com.atyouyou;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();
        product.methodSame();
    }
}
