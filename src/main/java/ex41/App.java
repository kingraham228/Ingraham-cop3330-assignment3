package ex41;

import java.nio.file.Path;
import java.util.ArrayList;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App 
{
    public static void main( String[] args )
    {
        final String fileName = "src/main/java/ex41/exercise41_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);



        //Convert file contents to Strings
        //Create new people objects
        //Add people to the record
        //Sort the record alphabetically
        //Print the total number of people
        //Print the alphabetized list

    }


}
