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
import java.util.Map;

public class JSONRecord {

    //Import JSON file into a string
    public void importJSON()  {
    try{
        Gson gson = new Gson();

        Reader reader = Files.newBufferedReader(Paths.get("src/main/java/ex44/exercise44_input.json"));

        Map<String,Products> map = gson.fromJson(reader, Map.class);

        for(Map.Entry<String, Products> entry: map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        reader.close();

    } catch (IOException e) {
        e.printStackTrace();
    }

    }



    //Search for matching JSON element
    //Retrieve current price from JSON
    //Retrieve current quantity from JSON
    //If found, Print product name, price, & quantity
    //If not found print out not found message and prompt again

}
