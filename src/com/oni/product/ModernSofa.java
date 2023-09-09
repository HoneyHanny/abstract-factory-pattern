package com.oni.product;

public class ModernSofa implements Sofa {
    @Override
    public void sitOn1() {
        System.out.println("Sit on the right like a normal person.");
    }

    @Override
    public void sitOn2() {
        System.out.println("Sit on the center like a boss.");
    }

    @Override
    public void sitOn3() {
        System.out.println("Sit as the right hand of the boss.");
    }

    @Override
    public String getFurniture() {
        return "Modern sofa";
    }

    @Override
    public void use() {
        sitOn1();
        sitOn2();
        sitOn3();
    }
}
