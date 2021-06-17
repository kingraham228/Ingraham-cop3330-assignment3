package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class Input {
    private static final Scanner input = new Scanner(System.in);

    //Take in Product Name Input
    public String getProductName(){
        System.out.println("What is the product name?");
        return input.nextLine();
    }
}
