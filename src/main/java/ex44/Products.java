package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.ArrayList;

public class Products {
    private final ArrayList<Items> products = new ArrayList<>();

    public ArrayList<Items> getProducts() {
        return products;
    }

    public static class Items {
        protected String name;
        protected double price;
        protected int quantity;
    }
}
