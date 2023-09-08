package com.oni.factory;

import com.oni.product.*;

public class ModernFurnitureFactory extends FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Sofa createSofa() {
        return new ModernSofa();
    }

    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

	public Shelf createShelf() {
		return new ModernShelf();
	}
}
