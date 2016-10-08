package com.design.patterns.chapter7.adapter.enumiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @author Tolga Duzenli on 07-Oct-2016.
 */
public class IteratorEnumerationTestDrive {

    public static void main(String args[]) {
        ArrayList<String> l = new ArrayList<String>(Arrays.asList(args));
        l.add("e");
        l.add("f");
        l.add("g");
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
