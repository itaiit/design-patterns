package com.atyouyou;

public class Client {
    public static void main(String[] args) {
        Product product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();
    }
}
