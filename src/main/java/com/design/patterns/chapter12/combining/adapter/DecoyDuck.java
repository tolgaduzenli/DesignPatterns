package com.design.patterns.chapter12.combining.adapter;

public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
