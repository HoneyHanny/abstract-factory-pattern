import Factory.ArtDecoFurnitureFactory;
import Factory.FurnitureFactory;
import Factory.ModernFurnitureFactory;
import Factory.VictorianFurnitureFactory;

import Product.Chair;
import Product.CoffeeTable;
import Product.Sofa;

public class Main {
	public static void main(String[] args) {
		FurnitureFactory mff = new ModernFurnitureFactory();
		FurnitureFactory vff = new VictorianFurnitureFactory();
		FurnitureFactory aff = new ArtDecoFurnitureFactory();

		Chair modernChair = mff.createChair();
		Chair victorianChair = vff.createChair();
		Chair artDecoChair = aff.createChair();

		Sofa modernSofa = mff.createSofa();
		Sofa victorianSofa = vff.createSofa();
		Sofa artDecoSofa = aff.createSofa();

		CoffeeTable modernCoffeeTable = mff.createCoffeeTable();
		CoffeeTable victorianCoffeeTable = vff.createCoffeeTable();
		CoffeeTable artDecoCoffeeTable = aff.createCoffeeTable();

		modernChair.sitOn();
		victorianChair.sitOn();
		artDecoChair.sitOn();

		modernSofa.sitOn1();
		victorianSofa.sitOn2();
		artDecoSofa.sitOn3();

		modernCoffeeTable.putCoffeeOn();
		victorianCoffeeTable.putCoffeeOn();
		artDecoCoffeeTable.putCoffeeOn();
	}
}