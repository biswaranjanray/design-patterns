package com.java.designpatterns.structural.decorator;

public abstract class Toppings implements Pizza {
	//here the intension is to add decorator design pattern. It uses 
	//this instance variable to refer any pizza and decorates it 
	//in Toppings concrete subclasses.
	protected Pizza pizza; 
}
