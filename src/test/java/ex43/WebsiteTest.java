package ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WebsiteTest {

    @Test
    @DisplayName("File Creating Test")
    void makeHTML() {
        String siteName = "Testing";
        String author = "Kate I";
        Website testWeb = new Website(siteName,author);
        String actual = testWeb.makeHTML();
        String expected = "Created .src\\main\\java\\ex43\\website\\index.html";

        assertEquals(expected, actual);

    }


}