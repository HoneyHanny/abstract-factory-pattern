public class Main {
	public static void main(String[] args) {
		ModernFurnitureFactory mff = new ModernFurnitureFactory();
		VictorianFurnitureFactory vff = new VictorianFurnitureFactory();
		ArtDecoFurnitureFactory aff = new ArtDecoFurnitureFactory();

		Chair modernChair1 = new ModernChair();

		Chair modernChair = mff.createChair();
		Chair victorianChair = vff.createChair();
		Chair artDecoChair = aff.createChair();

		Sofa modernSofa = mff.createSofa();
		Sofa victorianSofa = vff.createSofa();
		Sofa artDecoSofa = aff.createSofa();

		CoffeeTable modernCoffeeTable = mff.createCoffeeTable();
		CoffeeTable victorianCoffeeTable = vff.createCoffeeTable();
		CoffeeTable artDecoCoffeeTable = aff.createCoffeeTable();
	}
}