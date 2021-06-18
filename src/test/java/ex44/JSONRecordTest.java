package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;

class JSONRecordTest {


    @Test
    @DisplayName("Json file test")
    void importJSON() {
        JSONRecord test = new JSONRecord();
        test.importJSON();
        ArrayList<Products.Items> testArray = test.getItemList();
        Products.Items testItem = testArray.get(0);
        String actual = testItem.name;
        String expected = "Widget";

        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("price Test")
    void importJSON_priceTest() {
        JSONRecord test = new JSONRecord();
        test.importJSON();
        ArrayList<Products.Items> testArray = test.getItemList();
        Products.Items testItem = testArray.get(1);
        double actual = testItem.price;
        double expected = 15.00;

        assertEquals(expected,actual,.001);

    }

    @Test
    @DisplayName("quantity Test")
    void importJSON_quantityTest() {
        JSONRecord test = new JSONRecord();
        test.importJSON();
        ArrayList<Products.Items> testArray = test.getItemList();
        Products.Items testItem = testArray.get(2);
        int actual = testItem.quantity;
        int expected = 10;

        assertEquals(expected,actual,.001);

    }

    @Test
    @DisplayName("Search List Doodad")
    void searchList_Doodad() {
        JSONRecord test = new JSONRecord();
        test.importJSON();
        ArrayList<Products.Items> testArray = test.getItemList();
        String searchString = "doodad";
        String  actual = test.searchList(testArray,searchString);
        String rName = "Doodad";
        String rPrice = "5.00";
        String rquantity = "10";
        String  expected = String.format("Name: %s%nPrice: %s%nQuantity: %s",rName,rPrice,rquantity);


        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Search List Widget")
    void searchList_widget() {
        JSONRecord test = new JSONRecord();
        test.importJSON();
        ArrayList<Products.Items> testArray = test.getItemList();
        String searchString = "widget";
        String  actual = test.searchList(testArray,searchString);
        String rName = "Widget";
        String rPrice = "25.00";
        String rquantity = "5";
        String  expected = String.format("Name: %s%nPrice: %s%nQuantity: %s",rName,rPrice,rquantity);


        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Search List Thing")
    void searchList_thing() {
        JSONRecord test = new JSONRecord();
        test.importJSON();
        ArrayList<Products.Items> testArray = test.getItemList();
        String searchString = "thing";
        String  actual = test.searchList(testArray,searchString);
        String rName = "Thing";
        String rPrice = "15.00";
        String rquantity = "5";
        String  expected = String.format("Name: %s%nPrice: %s%nQuantity: %s",rName,rPrice,rquantity);


        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Search List not there")
    void searchList_notThere() {
        JSONRecord test = new JSONRecord();
        test.importJSON();
        ArrayList<Products.Items> testArray = test.getItemList();
        String searchString = "iPad";
        String  actual = test.searchList(testArray,searchString);
        String  expected = "Sorry, that product was not found in our inventory.";


        assertEquals(expected,actual);
    }
}