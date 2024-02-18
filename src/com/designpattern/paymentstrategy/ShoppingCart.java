package com.designpattern.paymentstrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	public List<Item> items;
	
	public ShoppingCart() {
		items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public Integer calculateTotal() {
		Integer sum = 0;
		for(Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentStrategy strategy) {
		Integer amount = calculateTotal();
		strategy.pay(amount);
	}
}
