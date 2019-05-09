package com.java.designpatterns.structural.decorator;

public class DecoratorPatternTest {
	
	public static void main(String[] args) {
		
		System.out.println("============= Welcome to the PizzaApp ==========");
		System.out.println();
		
		Pizza vegPizza = new VegPizza();
		String name = vegPizza.getDescription();
		
		StringBuilder toppings = new StringBuilder();
		
		vegPizza = new Tomatoes(vegPizza);
		toppings.append(vegPizza.getDescription() + " , ");
		
		vegPizza = new Onions(vegPizza);
		toppings.append(vegPizza.getDescription() + " , ");
		
		vegPizza = new Cheese(vegPizza);
		toppings.append(vegPizza.getDescription());
		
		double total = vegPizza.cost();
		
		System.out.println("You have ordered for " + name + " with following toppings: " + toppings);
		System.out.println("Your total cost is: " + total);
		
	}
}
