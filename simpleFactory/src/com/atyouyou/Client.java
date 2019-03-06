package com.atyouyou;

public class Client {
    public static void main(String[] args) {
        // Product product = Factory.getProduct("A");
        Product product = Product.getProduct("B");
        product.methodSame();
        product.methodDiff();
    }
}
