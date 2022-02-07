package com.company;

import java.util.Comparator;

public class CountryNbCharComparator implements Comparator<Country> {
    @Override
    public int compare(Country c1, Country c2) {
        return Integer.compare(c1.getName().length(), c2.getName().length()) ;
    }
}
