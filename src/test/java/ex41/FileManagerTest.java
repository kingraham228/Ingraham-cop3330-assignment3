package ex41;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    @DisplayName("File Path Test")
    void findFile_pathTest() {
        FileManager test = new FileManager();
        String fileName = "src/main/java/ex41/exercise41_input.txt";
        Path actual = test.findFile(fileName);
        Path expected = Path.of("src/main/java/ex41/exercise41_input.txt");

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("File Path Test - Non File")
    void findFile_pathTest_nonFile() {
        FileManager test = new FileManager();
        String fileName = "madeupfile.txt";
        Path actual = test.findFile(fileName);
        Path expected = Path.of("madeupfile.txt");

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test Reading file Given file")
    void readFile_given() {
        FileManager test = new FileManager();
        String fileName = "src/main/java/ex41/exercise41_input.txt";
        Path path = test.findFile(fileName);
        ArrayList<String> arrayData = test.readFile(path);
        String actual = arrayData.toString();
        String expected = "[Ling, Mai, Johnson, Jim, Zarnecki, Sabrina, Jones, Chris, Jones, Aaron, Swift, Geoffrey, Xiong, Fong]";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test Non-file")
    void readFile_given_nonFile() {
        FileManager test = new FileManager();
        String fileName = "madeupfile.txt";
        Path path = test.findFile(fileName);
        ArrayList<String> arrayData = test.readFile(path);
        String actual = arrayData.toString();
        String expected = "[]";

        assertEquals(expected,actual);
    }
}