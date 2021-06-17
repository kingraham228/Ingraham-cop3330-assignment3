package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalRecordTest {

    @Test
    @DisplayName("Test Record conversion First")
    void getRecord() {
        final String fileName = "src/main/java/ex42/exercise42_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);

        SalRecord newSalRecord = new SalRecord(fileData);
        ArrayList<Employee> testRecord = newSalRecord.getRecord();
        Employee testEmp = testRecord.get(0);
        String actual = testEmp.getLastName()+" "+testEmp.getFirstName()+" "+testEmp.getSalary();
        String expected = "Ling Mai 55900";

        assertEquals(expected,actual);


    }

    @Test
    @DisplayName("Test Record conversion Last")
    void getRecord_last() {
        final String fileName = "src/main/java/ex42/exercise42_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);

        SalRecord newSalRecord = new SalRecord(fileData);
        ArrayList<Employee> testRecord = newSalRecord.getRecord();
        Employee testEmp = testRecord.get((testRecord.size()-1));
        String actual = testEmp.getLastName()+" "+testEmp.getFirstName()+" "+testEmp.getSalary();
        String expected = "Zarnecki Sabrina 51500";

        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Test Record conversion Mid")
    void getRecord_mid() {
        final String fileName = "src/main/java/ex42/exercise42_input.txt";
        FileManager newFile = new FileManager();
        Path filePath = newFile.findFile(fileName);
        ArrayList<String> fileData = newFile.readFile(filePath);

        SalRecord newSalRecord = new SalRecord(fileData);
        ArrayList<Employee> testRecord = newSalRecord.getRecord();
        Employee testEmp = testRecord.get(3);
        String actual = testEmp.getLastName()+" "+testEmp.getFirstName()+" "+testEmp.getSalary();
        String expected = "Jones Chris 34500";


        assertEquals(expected,actual);
    }


}