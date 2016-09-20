package com.design.patterns.chapter2.subject;

import com.design.patterns.chapter2.observer.Observer;

/**
 * @author Tolga Duzenli on 20-Sep-2016.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
