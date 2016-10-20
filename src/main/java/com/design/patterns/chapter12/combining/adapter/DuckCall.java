package com.design.patterns.chapter12.combining.adapter;

public class DuckCall implements Quackable {
	public void quack() {
		System.out.println("Kwak");
	}
}
