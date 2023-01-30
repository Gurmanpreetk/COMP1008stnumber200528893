package com.example.comp1008test1java;

import java.util.Arrays;
import java.util.List;

public class Food {
    private String name;
    private int calories;
    private double price;
    private int protein;

    public static List<String>getListOfValidNames() {
        return Arrays.asList("AB", "GB");
    }
    public void setName(String name) {
        if (getListOfValidNames().contains(name))
        this.name = name;

        else
            throw new IllegalArgumentException(name +"recieved,but must be from"+
                    "the list "+ getListOfValidNames());
    }

    public static List<String>getListOfvalidCalories()
    {
        return Arrays.asList("0", "2000");
    }
    public void setCalories(int calories) {
        if (getListOfvalidCalories().contains(calories))
        this.calories = calories;

        else
            throw new IllegalArgumentException(calories +"wrong amount"+ "the list" + getListOfvalidCalories());
    }

    public static List<String>getListOfValidPrice() {
        return Arrays.asList("0", "150");
    }

    public void setPrice(double price) {
        if (getListOfValidPrice().contains(price))
        this.price = price;
        else
            throw new IllegalArgumentException(price+"not appropriete"+ "the list"+getListOfValidPrice());
    }
 public static List<String>getListOfValidProtien() {
     return Arrays.asList("0", "100");
 }

    public void setProtein(int protein) {
        if (getListOfValidProtien().contains(protein))
            this.protein = protein;
        else
            throw new IllegalArgumentException(protein + "requirement not met" + "the list" + getListOfValidProtien());
    }

    }
