package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.ArrayList;

public class Products {
    private ArrayList<Items> products = new ArrayList<Items>();

    public class Items{
        String name;
        double price;
        int quantity;
    }

    public ArrayList<Items> getProducts() {
        return products;
    }
}
