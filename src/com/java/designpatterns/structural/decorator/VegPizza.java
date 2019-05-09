package com.java.designpatterns.structural.decorator;

public class VegPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Paneer Pizza";
	}

	@Override
	public Double cost() {
		return 200.00;
	}

}
