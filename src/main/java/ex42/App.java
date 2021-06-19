package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.nio.file.Path;
import java.util.ArrayList;


public class App {
    public static void main(String[] args){
        final String fileName = "src/main/java/ex42/exercise42_input.txt";
        //Gather file information
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);
        //Turn file data into records
        SalRecord record = new SalRecord(fileData);
        //print the records as a table, evenly spaced
        record.printRecord();

    }

}
