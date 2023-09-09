package com.oni.product;

public class ArtDecoCoffeeTable implements CoffeeTable {
	@Override
	public void drinkCoffeeOn() {
		System.out.println("Sip and paint.");
	}

	@Override
	public String getFurniture() {
		return "Art Deco coffee table";
	}

	@Override
	public void use() {
		drinkCoffeeOn();
	}
}
