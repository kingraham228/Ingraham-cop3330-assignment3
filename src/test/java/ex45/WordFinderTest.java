package ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordFinderTest {

    @Test
    @DisplayName("Search and Replace line 1")
    void searchAndReplace() {
        Files testFile = new Files();
        String fileName = "src/main/java/ex45/exercise45_input.txt";
        Path inputFile = testFile.getFilePath(fileName);
        testFile.fileImport(inputFile);
        ArrayList<String> fileData = testFile.getFileData();
        WordFinder testWF = new WordFinder();
        ArrayList<String> newText = testWF.searchAndReplace(fileData);
        String actual = newText.get(0);
        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead.";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Search and Replace line 2")
    void searchAndReplace_line2() {
        Files testFile = new Files();
        String fileName = "src/main/java/ex45/exercise45_input.txt";
        Path inputFile = testFile.getFilePath(fileName);
        testFile.fileImport(inputFile);
        ArrayList<String> fileData = testFile.getFileData();
        WordFinder testWF = new WordFinder();
        ArrayList<String> newText = testWF.searchAndReplace(fileData);
        String actual = newText.get(1);
        String expected = "For example, \"She uses an IDE to write her Java programs\" instead of \"She";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Search and Replace line 3")
    void searchAndReplace_line3() {
        Files testFile = new Files();
        String fileName = "src/main/java/ex45/exercise45_input.txt";
        Path inputFile = testFile.getFilePath(fileName);
        testFile.fileImport(inputFile);
        ArrayList<String> fileData = testFile.getFileData();
        WordFinder testWF = new WordFinder();
        ArrayList<String> newText = testWF.searchAndReplace(fileData);
        String actual = newText.get(2);
        String expected = "uses an IDE to write her Java programs\".";

        assertEquals(expected,actual);
    }
}