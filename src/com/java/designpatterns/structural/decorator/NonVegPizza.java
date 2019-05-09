package com.java.designpatterns.structural.decorator;

public class NonVegPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Chicken Pizza";
	}

	@Override
	public Double cost() {
		return 300.00;
	}

}
