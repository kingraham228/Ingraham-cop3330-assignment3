package ex45;
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

public class Files {
    private String fileOutName;
    private ArrayList<String> fileData = new ArrayList<>();

    public ArrayList<String> getFileData() {
        return fileData;
    }

    public Path getFilePath(String fileName) {
        return Paths.get(fileName);
    }

    public void fileImport(Path filePath) {
        //Read text file
        try (Scanner input = new Scanner(filePath)) {
            //Save file data to ArrayList
            while (input.hasNext()) {
                String nextString = input.nextLine();
                fileData.add(nextString);
            }
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

    }


    public void fileOut() {


    }


}
