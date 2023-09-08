package com.oni.product;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void drinkCoffeeOn() {
        System.out.println("Drink caffeine like a millennial.");
    }

    @Override
    public String getFurniture() {
        return "Modern coffee table";
    }

    @Override
    public void use() {
        drinkCoffeeOn();
    }
}
