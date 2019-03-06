package com.atyouyou;

public class ConcreteFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
