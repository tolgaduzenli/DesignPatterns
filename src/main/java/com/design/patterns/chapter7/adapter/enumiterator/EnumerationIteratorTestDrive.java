package com.design.patterns.chapter7.adapter.enumiterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Tolga Duzenli on 07-Oct-2016.
 */
public class EnumerationIteratorTestDrive {

    public static void main (String args[]) {
        Vector<String> v = new Vector<String>(Arrays.asList(args));
        v.add("a");
        v.add("b");
        v.add("c");
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
