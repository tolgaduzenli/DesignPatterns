package com.design.patterns.chapter9.iterator.dinermerger;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
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
