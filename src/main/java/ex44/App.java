package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Import JSON file
        JSONRecord inventory = new JSONRecord();
        inventory.importJSON();
        ArrayList<Products.Items> items = inventory.getItemList();

        //Take in product name input
        Input userInput = new Input();
        String productName = userInput.getProductName();

        //Search for matching JSON element
        String searchResult = inventory.searchList(items, productName);

        //Print out search result
        System.out.println(searchResult);

        //Prompt if user needs to try again.
        while (inventory.isPromptAgain()) {
            productName = userInput.getProductName();
            searchResult = inventory.searchList(items, productName);
            System.out.println(searchResult);
        }

    }


}
