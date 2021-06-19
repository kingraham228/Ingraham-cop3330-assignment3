package ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KeyboardInput {
    private static final Scanner input = new Scanner(System.in);

    public String getOutputFileName() {
        //Ask user for the output file name
        String partialName;
        int inputValidation;
        do {
            System.out.println("Enter the text file name without the .txt ending:");
            partialName = input.nextLine();
            //Make sure the site name doesn't include illegal characters
            Pattern webPattern = Pattern.compile("[^a-zA-Z0-9 _]");
            Matcher matcher = webPattern.matcher(partialName);
            boolean stringIllegalCharacters = matcher.find();
            if(stringIllegalCharacters){
                System.out.println("File names cannot contain special characters.");
                inputValidation = -1;
            }else{
                inputValidation = 1;
            }
        } while(inputValidation<0);
        //build the appropriate output path.
       String rootPath =  "src/main/java/ex45/";
       String fileExtension = ".txt";
       return rootPath+partialName+fileExtension;

    }


}
