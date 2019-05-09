package com.java.designpatterns.structural.decorator;

public class Onions extends Toppings {

	public Onions(Pizza pizza) {
		this.pizza = pizza;
	}
	  
	@Override
	public String getDescription() {
		return "Onions";
	}

	@Override
	public Double cost() {
		return pizza.cost() + 25.00;
	}
}
