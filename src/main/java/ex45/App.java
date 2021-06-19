package ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.nio.file.Path;
import java.util.ArrayList;


public class App {
    public static void main(String [] args){
        final String inputFileName = "src/main/java/ex45/exercise45_input.txt";
        //Ask user for the output file name
        KeyboardInput userIn = new KeyboardInput();
        String outputFile = userIn.getOutputFileName();

        //Read text file
        Files inputFile = new Files();
        Path filePath = inputFile.getFilePath(inputFileName);
        inputFile.fileImport(filePath);

        //Search and replace
        WordFinder wf = new WordFinder();
        ArrayList<String> editedText = wf.searchAndReplace(inputFile.getFileData());

        //write text to a new file with user-provided name
        inputFile.fileOut(editedText,outputFile);

    }
}
