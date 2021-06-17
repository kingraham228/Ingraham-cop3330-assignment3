package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class JSONRecord {
    ArrayList<Product> productRecord = new ArrayList<>();

    //Import JSON file into a string
    public ArrayList<String> importJSON(){
        ArrayList<String> fileData = new ArrayList<>();
        try(Scanner input = new Scanner("src/main/java/ex44/exercise44_input.json")){
            while (input.hasNext()){
                String nextString = input.nextLine();
                System.out.println(nextString);
                fileData.add(nextString);
            }
        }
        catch (NoSuchElementException | IllegalStateException e){
            e.printStackTrace();
        }
        return fileData;
    }

    public ArrayList<Product> getProductRecord() {
        return productRecord;
    }

    //Search for matching JSON element
    //Retrieve current price from JSON
    //Retrieve current quantity from JSON
    //If found, Print product name, price, & quantity
    //If not found print out not found message and prompt again

}
