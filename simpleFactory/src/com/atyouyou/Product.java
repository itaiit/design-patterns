package com.atyouyou;

abstract class Product {
    public void methodSame(){
        System.out.println("methodSame()");
    }
    public abstract void methodDiff();

    public static Product getProduct(String arg){
        Product product = null;
        if (arg.equalsIgnoreCase("A")){
            product = new ConcreteProductA();
        } else if (arg.equalsIgnoreCase("B")){
            product = new ConcreteProductB();
        }
        return product;
    }
}
