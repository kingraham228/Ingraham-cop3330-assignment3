package ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilesTest {

    @Test
    @DisplayName("Import Test")
    void fileImport() {
        Files testFile = new Files();
        String fileName = "src/main/java/ex45/exercise45_input.txt";
        Path inputFile = testFile.getFilePath(fileName);
        testFile.fileImport(inputFile);
        ArrayList<String> fileData = testFile.getFileData();
        String actual = fileData.get(0);
        String expected = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.";

        assertEquals(expected,actual);

    }
}