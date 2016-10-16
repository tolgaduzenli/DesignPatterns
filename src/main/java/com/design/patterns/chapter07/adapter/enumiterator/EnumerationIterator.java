package com.design.patterns.chapter07.adapter.enumiterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Tolga Duzenli on 07-Oct-2016.
 */
public class EnumerationIterator implements Iterator<Object> {

    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
