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
   private ArrayList<Products.Items> itemList = new ArrayList<>();
   public boolean promptAgain;

    //Import JSON file into a nested class matching the file
    public void importJSON() {
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

    //Search for matching JSON element
    public String searchList(ArrayList<Products.Items> itemList, String search){
        ArrayList<Products.Items> result = new ArrayList<>();
        String strResults;
        for(int i=0; i< itemList.size(); i++){
            Products.Items searchItem = itemList.get(i);
            if(searchItem.name.equalsIgnoreCase(search)){
                result.add(searchItem);
            }
        }
        //If found, return product name, price, & quantity
        if(result.size()!=0) {
            String rName = result.get(0).name;
            //Retrieve current price from JSON
            double rPrice = result.get(0).price;
            //Retrieve current quantity from JSON
            int rquant = result.get(0).quantity;
            strResults = String.format("Name: %s%nPrice: %.02f%nQuantity: %d", rName, rPrice, rquant);
            promptAgain = false;
            //If not found send out not found message
        } else{
            promptAgain = true;
            strResults = "Sorry, that product was not found in our inventory.";
        }
        return strResults;
    }







}
