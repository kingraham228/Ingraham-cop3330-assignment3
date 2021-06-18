package ex44;

import java.util.ArrayList;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String[] args){
        //Import JSON file
        JSONRecord inventory = new JSONRecord();
        inventory.importJSON();
        ArrayList<Products.Items> items = inventory.getItemList();

        //Take in product name input
        Input userInput = new Input();
        String productName = userInput.getProductName();

        //Search for matching JSON element
        String searchResult = inventory.searchList(items,productName);

        //Print out search result
        System.out.println(searchResult);

        //Prompt if user needs to try again.
        while (inventory.promptAgain){
            productName = userInput.getProductName();
            searchResult = inventory.searchList(items,productName);
            System.out.println(searchResult);
        }

    }


}
