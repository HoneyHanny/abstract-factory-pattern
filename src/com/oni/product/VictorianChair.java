package com.oni.product;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.printf("Sit on and old school chair.");
    }

    @Override
    public String getFurniture() {
        return "Victorian chair";
    }

    @Override
    public void use() {
        sitOn();
    }
}
