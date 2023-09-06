package com.oni.Factory;

import com.oni.Product.*;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
	@Override
	public Chair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ArtDecoCoffeeTable();
	}

	@Override
	public Shelf createShelf() {
		return new ArtDecoShelf();
	}
}
