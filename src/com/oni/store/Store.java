package com.oni.store;

import com.oni.customer.Customer;
import com.oni.factory.FurnitureFactory;
import com.oni.product.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Locale;

public abstract class Store {
	protected String name;
	protected FurnitureFactory factory;
	protected Locale locale;
	protected float revenue;

	public Store(Locale locale, float revenue, String name) {
		this.locale = locale;
		this.revenue = revenue;
		this.name = name;
	}

	protected boolean processPayment(Customer customer, float itemCost) {
		if (customer.money < itemCost)
			return false;

		customer.money -= itemCost;

		System.out.println("Sold.");
		Currency currency = Currency.getInstance(locale);

		System.out.println("--- Generating receipt... ---");
		System.out.println("Customer: " + customer.name);
		System.out.println("Date & time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
		System.out.println("Store: " + name);
		System.out.println("Country: " + locale.getDisplayCountry());
		System.out.println("Amount: " + currency.getSymbol() + itemCost);
		System.out.println("-----------------------------");

		revenue += itemCost;
		return true;
	}

	public abstract boolean sellChair(Customer customer);
	public abstract boolean sellSofa(Customer customer);
	public abstract boolean sellCoffeeTable(Customer customer);
	public abstract boolean sellShelf(Customer customer);

	protected void cancelDueToPaymentIssues() {
		System.out.println("Cancelled: (Insufficient amount)");
	}

	public abstract void displayItems();

	protected void deliver(Product product, Customer customer) {
		customer.home.furnitures.add(product);
		System.out.println("Product delivered.");
	}
}
