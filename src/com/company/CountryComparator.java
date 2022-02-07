package com.company;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CountryComparator implements Comparator<Country> {

    @Override
    public int compare(Country c1, Country c2) {
        return c1.getName().compareTo(c2.getName()) ;
    }

}
