package com.oni.product;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sit comfortably on a modern chair.");
    }

    @Override
    public String getFurniture() {
        return "Modern chair";
    }

    @Override
    public void use() {
        sitOn();
    }
}
