package com.oni.factory;

import com.oni.product.Chair;
import com.oni.product.CoffeeTable;
import com.oni.product.Shelf;
import com.oni.product.Sofa;

public abstract class FurnitureFactory {
    public abstract Chair createChair();
    public abstract Sofa createSofa();
    public abstract CoffeeTable createCoffeeTable();
	public abstract Shelf createShelf();
}
