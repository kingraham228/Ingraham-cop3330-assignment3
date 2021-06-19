package ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Files {
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

    //write text to a new file with user-provided name
    public void fileOut(ArrayList<String> outputText, String fileOutName) {
        try (Formatter output = new Formatter(fileOutName)) {
            for (int i = 0; i < outputText.size(); i++) {
                output.format("%s%n",outputText.get(i));
            }

        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }

    }
}
