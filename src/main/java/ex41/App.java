package ex41;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App 
{
    public static void main( String[] args )
    {
        //Read in a new file
        //Needs to be in main, not a separate function
        //Convert file contents to Strings
        //Create new people objects
        //Add people to the record
        //Sort the record alphabetically
        //Print the total number of people
        //Print the alphabetized list

    }

    public static void readFile(String [] fileInput){
        //Note: This code adapted from Dr. McAlpin's CIS3360 class
        for(int i=0; i< fileInput.length; i++){
            String s = fileInput[i];
        }
        File nameFile = new File(fileInput[0]);
        try{
            BufferedReader br = new BufferedReader(new FileReader(nameFile));
            System.out.println("\nFile opened successfully.");
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
