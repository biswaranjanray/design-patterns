package com.java.designpatterns.structural.decorator;

public class Cheese extends Toppings {

	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
	  
	@Override
	public String getDescription() {
		return "Cheese";
	}

	@Override
	public Double cost() {
		return pizza.cost() + 30.00;
	}
}
