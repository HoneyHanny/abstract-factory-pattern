package com.oni.product;

public class VictorianSofa implements Sofa {
    @Override
    public void sitOn1() {
        System.out.println("Your grandfather sits here.");
    }

    @Override
    public void sitOn2() {
        System.out.println("Sit between your grandparents.");
    }

    @Override
    public void sitOn3() {
        System.out.println("Your grandmother sits here.");
    }

    @Override
    public String getFurniture() {
        return "Victorian sofa";
    }

    @Override
    public void use() {
        sitOn1();
        sitOn2();
        sitOn3();
    }
}
