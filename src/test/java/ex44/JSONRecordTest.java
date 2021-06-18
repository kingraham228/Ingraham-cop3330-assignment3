package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class JSONRecordTest {


    @Test
    @DisplayName("Json file test")
    void importJSON() {
        JSONRecord test = new JSONRecord();
        test.importJSON();

    }
}