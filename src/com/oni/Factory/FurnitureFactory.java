package com.oni.Factory;

import com.oni.Product.Chair;
import com.oni.Product.CoffeeTable;
import com.oni.Product.Shelf;
import com.oni.Product.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
	Shelf createShelf();
}
