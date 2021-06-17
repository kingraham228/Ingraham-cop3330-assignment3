package ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {

    @Test
    @DisplayName("File Creating Test")
    void makeHTML() {
        String siteName = "Test3";
        String author = "Kate I";
        Website testWeb = new Website(siteName,author);
        testWeb.makeHTML();
    }
}