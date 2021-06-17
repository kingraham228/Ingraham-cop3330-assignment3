package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JSONRecordTest {


    @Test
    @DisplayName("Json import test First Item")
    void importJSON_first() {
        JSONRecord testRecord = new JSONRecord();
        ArrayList<String> testArray = testRecord.importJSON();
        String actual = testArray.toString();
        String expected = "";

        assertEquals(expected,actual);
    }
}