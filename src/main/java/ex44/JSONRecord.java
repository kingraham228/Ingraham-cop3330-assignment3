package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */


import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class JSONRecord {
   ArrayList<Products.Items> itemList = new ArrayList<>();

    //Import JSON file into a string
    public void importJSON() {
        //code adapted from https://attacomsian.com/blog/gson-read-json-file
        try {
            Gson gson = new Gson();
            //read in file
            Reader reader = Files.newBufferedReader(Paths.get("src/main/java/ex44/exercise44_input.json"));
            //convert json to map
            //jsonInventory = gson.fromJson(reader, Map.class);
            Products inventory = gson.fromJson(reader, Products.class);
            itemList = inventory.getProducts();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Products.Items> getItemList() {
        return itemList;
    }

    //Make a searchable array
    //Search for matching JSON element


    //Retrieve current price from JSON
    //Retrieve current quantity from JSON
    //If found, Print product name, price, & quantity
    //If not found print out not found message and prompt again

}
