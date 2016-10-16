package com.design.patterns.chapter09.iterator.dinermerger;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    public ArrayList<MenuItem> items;
    public int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem item = items.get(position);
        position = position + 1;
        return item;
    }

    public boolean hasNext() {
        return !(position >= items.size());
    }
}
