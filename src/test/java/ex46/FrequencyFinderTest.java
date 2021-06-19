package ex46;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrequencyFinderTest {

    @Test
    @DisplayName("Map Test Badger")
    void makeMap_badger() {
        FileIn ex46 = new FileIn();
        String fileName = "src/main/java/ex46/exercise46_input.txt";
        Path inputFile = ex46.getFilePath(fileName);
        ex46.fileImport(inputFile);
        ArrayList<String> fileData = ex46.getFileData();

        FrequencyFinder wordFreq = new FrequencyFinder();
        wordFreq.makeMap(fileData);
        Map<String, Integer> testMap = wordFreq.getWordMap();

        int actual = testMap.get("badger");
        int expected = 7;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Map Test Mushroom")
    void makeMap_mushroom() {
        FileIn ex46 = new FileIn();
        String fileName = "src/main/java/ex46/exercise46_input.txt";
        Path inputFile = ex46.getFilePath(fileName);
        ex46.fileImport(inputFile);
        ArrayList<String> fileData = ex46.getFileData();

        FrequencyFinder wordFreq = new FrequencyFinder();
        wordFreq.makeMap(fileData);
        Map<String, Integer> testMap = wordFreq.getWordMap();

        int actual = testMap.get("mushroom");
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Map Test Snake")
    void makeMap_snake() {
        FileIn ex46 = new FileIn();
        String fileName = "src/main/java/ex46/exercise46_input.txt";
        Path inputFile = ex46.getFilePath(fileName);
        ex46.fileImport(inputFile);
        ArrayList<String> fileData = ex46.getFileData();

        FrequencyFinder wordFreq = new FrequencyFinder();
        wordFreq.makeMap(fileData);
        Map<String, Integer> testMap = wordFreq.getWordMap();

        int actual = testMap.get("snake");
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Sort Test File")
    void sortbyValue_sortFileTest() {
        FileIn ex46 = new FileIn();
        String fileName = "src/main/java/ex46/sorting_testing_input.txt";
        Path inputFile = ex46.getFilePath(fileName);
        ex46.fileImport(inputFile);
        ArrayList<String> fileData = ex46.getFileData();

        FrequencyFinder wordFreq = new FrequencyFinder();
        wordFreq.makeMap(fileData);
        Map<String, Integer> testMap = wordFreq.getWordMap();
        Map<String, Integer> sortedMap = wordFreq.sortbyValue(testMap);

        int actual = sortedMap.get("zebra");
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Sort Test File with Print")
    void sortbyValue_sortFileTestPrint() {
        FileIn ex46 = new FileIn();
        String fileName = "src/main/java/ex46/sorting_testing_input.txt";
        Path inputFile = ex46.getFilePath(fileName);
        ex46.fileImport(inputFile);
        ArrayList<String> fileData = ex46.getFileData();

        FrequencyFinder wordFreq = new FrequencyFinder();
        wordFreq.makeMap(fileData);
        Map<String, Integer> testMap = wordFreq.getWordMap();
        Map<String, Integer> sortedMap = wordFreq.sortbyValue(testMap);
        wordFreq.printHistogram(sortedMap);

        int actual = sortedMap.get("zebra");
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Normal Test File with Print")
    void sortbyValue_normalFileTestPrint() {
        FileIn ex46 = new FileIn();
        String fileName = "src/main/java/ex46/exercise46_input.txt";
        Path inputFile = ex46.getFilePath(fileName);
        ex46.fileImport(inputFile);
        ArrayList<String> fileData = ex46.getFileData();

        FrequencyFinder wordFreq = new FrequencyFinder();
        wordFreq.makeMap(fileData);
        Map<String, Integer> testMap = wordFreq.getWordMap();
        Map<String, Integer> sortedMap = wordFreq.sortbyValue(testMap);
        wordFreq.printHistogram(sortedMap);

        int actual = sortedMap.get("mushroom");
        int expected = 2;

        assertEquals(expected, actual);

    }
}