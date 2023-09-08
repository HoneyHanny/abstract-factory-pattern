package com.oni.store;

import com.oni.buyer.Customer;
import com.oni.factory.ModernFurnitureFactory;

import java.util.Currency;
import java.util.Locale;

public class ModernStore extends Store {
	private static final float CHAIR_COST = 50;
	private static final float SOFA_COST = 150;
	private static final float COFFEE_TABLE_COST = 100;
	private static final float SHELF_COST = 90;

	public ModernStore(Locale locale, float revenue, String name) {
		super(locale, revenue, name);
		factory = new ModernFurnitureFactory();
	}

	@Override
	public boolean sellChair(Customer customer) {
		if (!processPayment(customer, CHAIR_COST)) {
			cancelDueToPaymentIssues();
			return false;
		}

		var product = factory.createChair();

		deliver(product, customer);

		return true;
	}

	@Override
	public boolean sellSofa(Customer customer) {
		if (!processPayment(customer, SOFA_COST)) {
			cancelDueToPaymentIssues();
			return false;
		}

		var product = factory.createSofa();

		deliver(product, customer);

		return true;
	}

	@Override
	public boolean sellCoffeeTable(Customer customer) {
		if (!processPayment(customer, COFFEE_TABLE_COST)) {
			cancelDueToPaymentIssues();
			return false;
		}

		var product = factory.createCoffeeTable();

		deliver(product, customer);

		return true;
	}

	@Override
	public boolean sellShelf(Customer customer) {
		if (!processPayment(customer, SHELF_COST)) {
			cancelDueToPaymentIssues();
			return false;
		}

		var product = factory.createShelf();

		deliver(product, customer);

		return true;
	}

	@Override
	public void displayItems() {
		Currency currency = Currency.getInstance(locale);
		System.out.println("1. Chair: " + currency.getSymbol() + CHAIR_COST);
		System.out.println("2. Sofa: " + currency.getSymbol() + SOFA_COST);
		System.out.println("3. Coffee Table: " + currency.getSymbol() + COFFEE_TABLE_COST);
		System.out.println("4. Shelf: " + currency.getSymbol() + SHELF_COST);
	}

}
