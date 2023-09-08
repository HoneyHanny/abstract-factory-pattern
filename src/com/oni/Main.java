package com.oni;

import com.oni.buyer.Customer;
import com.oni.buyer.Home;
import com.oni.store.ArtDecoStore;
import com.oni.store.ModernStore;
import com.oni.store.Store;
import com.oni.store.VictorianStore;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Locale currentLocale = new Locale("en", "PH");

		var buyer = new Customer("Hans", new Home("L-123-420"), 1000);

		var modernStore = new ModernStore(currentLocale, 0, "Modern Store");
		var victorianStore = new VictorianStore(currentLocale, 0, "Victorian Store");
		var artDecoStore = new ArtDecoStore(currentLocale, 0, "ArtDeco Store");

		boolean buying = true;
		while (buying) {

			int store;
			do {
				System.out.println();
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

		System.out.println("Going home...");
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