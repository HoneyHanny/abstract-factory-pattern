package com.oni;

import com.oni.customer.Customer;
import com.oni.customer.Home;
import com.oni.store.ArtDecoStore;
import com.oni.store.ModernStore;
import com.oni.store.Store;
import com.oni.store.VictorianStore;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

// Github: https://github.com/HoneyHanny/abstract-factory-pattern

public class Main {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Locale currentLocale = new Locale.Builder().setLanguage("en").setRegion("PH").build();

		System.out.print("Enter name: ");
		String name = scan.nextLine();
		System.out.print("Enter amount of money to bring: " + Currency.getInstance(currentLocale).getSymbol());
		float money = scan.nextFloat();
		var buyer = new Customer(name, new Home("L-123-420"), money);

		var modernStore = new ModernStore(currentLocale, 0, "Modern Store");
		var victorianStore = new VictorianStore(currentLocale, 0, "Victorian Store");
		var artDecoStore = new ArtDecoStore(currentLocale, 0, "ArtDeco Store");

		boolean buying = true;
		while (buying) {

			int store;
			do {
				System.out.println("\nCurrent money: " + Currency.getInstance(currentLocale).getSymbol() + String.format("%.2f", buyer.money));
				System.out.println("1. Modern store");
				System.out.println("2. Victorian store");
				System.out.println("3. Art Deco store");
				System.out.println("4. Exit");
				System.out.print("Choose a store: ");
				store = scan.nextInt();
			} while (store > 4);

			switch (store) {
				case 1 -> shop(modernStore, buyer);
				case 2 -> shop(victorianStore, buyer);
				case 3 -> shop(artDecoStore, buyer);
				case 4 -> buying = false;
			}

		}

		System.out.println("\nGoing home...");
		System.out.println("Displaying furnitures.");
		buyer.home.displayFurnitures();
		System.out.println("Using furnitures.");
		buyer.home.useFurnitures();

	}

	public static void shop(Store store, Customer customer) {

		int item;
		do {
			store.displayItems();
			System.out.print("Select item: ");
			item = scan.nextInt();
		} while (item > 4);


		switch (item) {
			case 1 -> store.sellChair(customer);
			case 2 -> store.sellSofa(customer);
			case 3 -> store.sellCoffeeTable(customer);
			case 4 -> store.sellShelf(customer);
		}
	}

}