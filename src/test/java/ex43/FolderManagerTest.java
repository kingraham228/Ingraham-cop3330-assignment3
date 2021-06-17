package ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FolderManagerTest {

    @Test
    @DisplayName("Website Folder Test ")
    void createWebsiteFolder() {
        FolderManager test = new FolderManager();
        String actual = test.createWebsiteFolder();
        String expected = "Created .src\\main\\java\\ex43\\website";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("JS Folder Test No")
    void createJSFolder_no() {
        boolean answer = false;
        FolderManager test = new FolderManager();
        String actual = test.createJSFolder(answer);
        String expected = "";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("JS Folder Test Yes")
    void createJSFolder_yes() {
        boolean answer = true;
        FolderManager test = new FolderManager();
        String actual = test.createJSFolder(answer);
        String expected = "Created .src\\main\\java\\ex43\\website\\js";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("CSS Folder Test No")
    void createCSSFolder_no() {
        boolean answer = false;
        FolderManager test = new FolderManager();
        String actual = test.createCSSFolder(answer);
        String expected = "";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("CSS Folder Test Yes")
    void createCSSFolder_yes() {
        boolean answer = true;
        FolderManager test = new FolderManager();
        String actual = test.createCSSFolder(answer);
        String expected = "Created .src\\main\\java\\ex43\\website\\css";

        assertEquals(expected,actual);
    }
}