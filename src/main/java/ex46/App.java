package ex46;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Map;


public class App {

    public static void main(String[] args) {
        //Read file exercise 46
        FileIn ex46 = new FileIn();
        String fileName = "src/main/java/ex46/exercise46_input.txt";
        Path inputFile = ex46.getFilePath(fileName);
        ex46.fileImport(inputFile);

        //Get file data
        ArrayList<String> fileData = ex46.getFileData();

        //Create a map of words in the file
        //count frequency of words in the file
        FrequencyFinder wordFreq = new FrequencyFinder();
        wordFreq.makeMap(fileData);

        //Sort most used words to least used
        Map<String, Integer> sortedMap = wordFreq.sortbyValue(wordFreq.getWordMap());

        //print histogram with words and frequency
        wordFreq.printHistogram(sortedMap);

    }
}
