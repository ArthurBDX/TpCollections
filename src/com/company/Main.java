package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Country> countries = new ArrayList<>();
        Country france = new Country("France");
        countries.add(france);
        Country allemagne = new Country("Allemagne");
        countries.add(allemagne);
        Country usa = new Country("USA");
        countries.add(usa);
        Country chine = new Country("Chine");
        countries.add(chine);

        System.out.println("La collection créée contient "+countries.size()+" pays !");

        try{
            AffCountries(countries);
        }catch (ListEmptyException e){
            System.out.println(e);
        }


        countries.clear();
        System.out.println("\n*** Liste effacée ***");

        try{
            AffCountries(countries);
        }catch (ListEmptyException e){
            System.out.println(e);
        }

        countries.add(france);
        countries.add(allemagne);
        countries.add(usa);
        countries.add(chine);

        usa.setName("Etats-Unis");
        System.out.println("\n*** USA -> Etats-Unis ***");

        try{
            AffCountries(countries);
        }catch (ListEmptyException e){
            System.out.println(e);
        }
        Collections.sort(countries, new CountryComparator());
        System.out.println("\n*** tri par ordre alphabétique ***");
        try{
            AffCountries(countries);
        }catch (ListEmptyException e){
            System.out.println(e);
        }

        Collections.sort(countries, new CountryNbCharComparator());
        System.out.println("\n*** tri par ordre de longueur ***");
        try{
            AffCountries(countries);
        }catch (ListEmptyException e){
            System.out.println(e);
        }


    }

    static void AffCountries(List<Country> countries) throws ListEmptyException {

        if (countries.isEmpty()){
            throw new ListEmptyException("Liste vide");
        }else{
            System.out.println("");
            for(Country country : countries){
                System.out.println(country.getName());
            }
        }
    }
}
