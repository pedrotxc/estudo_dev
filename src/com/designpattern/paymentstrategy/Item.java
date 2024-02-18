package com.designpattern.paymentstrategy;

public class Item {

	private String upCode;
	private Integer price;

	public Item(String upCode, Integer price) {
		super();
		this.upCode = upCode;
		this.price = price;
	}

	public String getUpCode() {
		return upCode;
	}

	public Integer getPrice() {
		return price;
	}

}
