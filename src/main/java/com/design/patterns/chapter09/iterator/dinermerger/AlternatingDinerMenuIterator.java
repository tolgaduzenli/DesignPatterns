package com.design.patterns.chapter09.iterator.dinermerger;

import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator {
    public MenuItem[] list;
    public int position;

    public AlternatingDinerMenuIterator(MenuItem[] list) {
        this.list = list;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 2;
        return menuItem;
    }

    public boolean hasNext() {
        boolean hasNext = true;
        if (position >= list.length || list[position] == null) {
            hasNext = false;
        }
        return hasNext;
    }

    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}
