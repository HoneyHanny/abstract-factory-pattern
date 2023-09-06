package Factory;

import Product.Chair;
import Product.CoffeeTable;
import Product.Shelf;
import Product.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
	Shelf createShelf();
}
