package ex41;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileManager {

    //Find the file
    public Path findFile(String fileName) {
        return Paths.get(fileName);
    }

    //Read information from the file
    public ArrayList<String> readFile(Path filepath){
        ArrayList<String> fileData = new ArrayList<>();
        try(Scanner input = new Scanner(filepath)){
            while (input.hasNext()){
              String nextString = input.nextLine();
              fileData.add(nextString);
            }
        }
        catch (IOException | NoSuchElementException | IllegalStateException e){
            e.printStackTrace();
        }
        return fileData;
    }

}
