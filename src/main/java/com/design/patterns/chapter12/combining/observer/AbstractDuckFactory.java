package com.design.patterns.chapter12.combining.observer;

public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
