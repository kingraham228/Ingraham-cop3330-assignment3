package ex46;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileInTest {

    @Test
    @DisplayName("Import Test first element")
    void fileImport() {
        FileIn ex46 = new FileIn();
        String fileName = "src/main/java/ex46/exercise46_input.txt";
        Path inputFile = ex46.getFilePath(fileName);
        ex46.fileImport(inputFile);
        ArrayList<String> fileData = ex46.getFileData();

        String actual = fileData.get(0);
        String expected = "badger";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Import Test last element")
    void fileImport_last() {
        FileIn ex46 = new FileIn();
        String fileName = "src/main/java/ex46/exercise46_input.txt";
        Path inputFile = ex46.getFilePath(fileName);
        ex46.fileImport(inputFile);
        ArrayList<String> fileData = ex46.getFileData();

        String actual = fileData.get((fileData.size()-1));
        String expected = "badger";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Import Test mid element")
    void fileImport_mid() {
        FileIn ex46 = new FileIn();
        String fileName = "src/main/java/ex46/exercise46_input.txt";
        Path inputFile = ex46.getFilePath(fileName);
        ex46.fileImport(inputFile);
        ArrayList<String> fileData = ex46.getFileData();

        String actual = fileData.get(6);
        String expected = "snake";

        assertEquals(expected,actual);
    }
}