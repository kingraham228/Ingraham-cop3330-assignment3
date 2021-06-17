package ex42;

import ex41.FileManager;
import ex41.Record;

import java.nio.file.Path;
import java.util.ArrayList;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String[] args){
        final String fileName = "src/main/java/ex42/exercise42_input.txt";
        //Gather file information
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);
        //Turn file data into records
        Record names = new Record(fileData);
        //print the records as a table, evenly spaced
        names.printRecord();





    }

}
