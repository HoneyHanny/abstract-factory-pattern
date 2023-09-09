package com.oni.customer;

import com.oni.product.Product;

import java.util.ArrayList;

public class Home {
	public ArrayList<Product> furnitures = new ArrayList<>();
	public String address;

	public Home(String address) {
		this.address = address;
	}

	public void displayFurnitures() {
		for (Product furniture : furnitures)
			displayFurniture(furniture);
	}

	public void displayFurniture(Product furniture) {
		System.out.println(furniture.getFurniture());
	}

	public void useFurnitures() {
		for (Product furniture : furnitures)
			useFurniture(furniture);
	}

	public void useFurniture(Product furniture) {
		furniture.use();
	}

}
