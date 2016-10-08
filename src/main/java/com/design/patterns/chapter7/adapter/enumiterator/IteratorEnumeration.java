package com.design.patterns.chapter7.adapter.enumiterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Tolga Duzenli on 07-Oct-2016.
 */
public class IteratorEnumeration implements Enumeration<Object> {

    Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return  iterator.next();
    }
}
