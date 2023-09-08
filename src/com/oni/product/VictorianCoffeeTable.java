package com.oni.product;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void drinkCoffeeOn() {
		System.out.println("Drink coffee in victorian fashion.");
    }

	@Override
	public String getFurniture() {
		return "Victorian coffee table";
	}

	@Override
	public void use() {
		drinkCoffeeOn();
	}
}
