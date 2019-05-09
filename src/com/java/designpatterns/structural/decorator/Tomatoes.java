package com.java.designpatterns.structural.decorator;

public class Tomatoes extends Toppings {

	public Tomatoes(Pizza pizza) {
		this.pizza = pizza;
	}
	  
	@Override
	public String getDescription() {
		return "Tomatoes";
	}

	@Override
	public Double cost() {
		return pizza.cost() + 20.00;
	}

}
