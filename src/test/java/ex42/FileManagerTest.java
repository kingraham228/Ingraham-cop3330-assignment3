package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    @DisplayName("Test Reading file Given file")
    void readFile_given() {
        FileManager test = new FileManager();
        String fileName = "src/main/java/ex42/exercise42_input.txt";
        Path path = test.findFile(fileName);
        ArrayList<String> arrayData = test.readFile(path);
        String actual = arrayData.toString();
        String expected = "[Ling,Mai,55900," +
                " Johnson,Jim,56500," +
                " Jones,Aaron,46000," +
                " Jones,Chris,34500," +
                " Swift,Geoffrey,14200," +
                " Xiong,Fong,65000," +
                " Zarnecki,Sabrina,51500]";

        assertEquals(expected,actual);
    }
}