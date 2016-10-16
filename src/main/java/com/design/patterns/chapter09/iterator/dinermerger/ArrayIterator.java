package com.design.patterns.chapter09.iterator.dinermerger;

public class ArrayIterator implements Iterator {
    public MenuItem[] items;
    public int position = 0;

    public ArrayIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        boolean hasNext = true;
        if (position >= items.length || items[position] == null) {
            hasNext = false;
        }
        return hasNext;
    }
}
