package com.design.patterns.chapter12.combining.observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
