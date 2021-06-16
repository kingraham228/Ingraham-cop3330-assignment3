package ex41;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RecordTest {

    @Test
    @DisplayName("Test record conversion First ")
    void getRecord_conversion_firstName() {
        final String fileName = "src/main/java/ex41/exercise41_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);
        Record newRecord = new Record(fileData);
        ArrayList<Person> testRecord = newRecord.getRecord();
        Person testPerson = testRecord.get(0);
        String actual = testPerson.getLastName()+" "+testPerson.getFirstName();
        String expected ="Ling, Mai";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test record conversion Last ")
    void getRecord_conversion_LastName() {
        final String fileName = "src/main/java/ex41/exercise41_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);
        Record newRecord = new Record(fileData);
        ArrayList<Person> testRecord = newRecord.getRecord();
        Person testPerson = testRecord.get((testRecord.size()-1));
        String actual = testPerson.getLastName()+" "+testPerson.getFirstName();
        String expected ="Xiong, Fong";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test record conversion Mid ")
    void getRecord_conversion_MidName() {
        final String fileName = "src/main/java/ex41/exercise41_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);
        Record newRecord = new Record(fileData);
        ArrayList<Person> testRecord = newRecord.getRecord();
        Person testPerson = testRecord.get(3);
        String actual = testPerson.getLastName()+" "+testPerson.getFirstName();
        String expected ="Jones, Chris";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test record count")
    void getRecordCount() {
        final String fileName = "src/main/java/ex41/exercise41_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);
        Record newRecord = new Record(fileData);
        int actual = newRecord.getRecordCount();
        int expected = 7;

        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Test of sorting")
    void sortRecord() {
        final String fileName = "src/main/java/ex41/exercise41_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);
        Record newRecord = new Record(fileData);
        newRecord.sortRecord();
        ArrayList<Person> testRecord = newRecord.getRecord();
        Person testPerson = testRecord.get(0);
        String actual = testPerson.getLastName()+" "+testPerson.getFirstName();
        String expected ="Johnson, Jim";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test of sorting Jones Distinction")
    void sortRecord_Jones() {
        final String fileName = "src/main/java/ex41/exercise41_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);
        Record newRecord = new Record(fileData);
        newRecord.sortRecord();
        ArrayList<Person> testRecord = newRecord.getRecord();
        Person testPerson = testRecord.get(1);
        String actual = testPerson.getLastName()+" "+testPerson.getFirstName();
        String expected ="Jones, Aaron";

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test of sorting Last Name")
    void sortRecord_Last() {
        final String fileName = "src/main/java/ex41/exercise41_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);
        Record newRecord = new Record(fileData);
        newRecord.sortRecord();
        ArrayList<Person> testRecord = newRecord.getRecord();
        Person testPerson = testRecord.get(6);
        String actual = testPerson.getLastName()+" "+testPerson.getFirstName();
        String expected ="Zarnecki, Sabrina";

        assertEquals(expected,actual);
    }
}