package ex43;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    //Prompt for the name of the site
    public String getSiteName(){
        String siteName;
        int inputValidation = 0;
        do {
            System.out.println("What is the name of your website?");
            siteName = input.nextLine();
            //Make sure the site name doesn't include illegal characters
            Pattern webPattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher matcher = webPattern.matcher(siteName);
            boolean stringIllegalCharacters = matcher.find();
            if(stringIllegalCharacters){
                System.out.println("Website names cannot contain special characters.");
                inputValidation = -1;
            }else{
                inputValidation = 1;
            }
        } while(inputValidation<0);
        return siteName;
    }

    //Prompt for the author of the site
    public String getAuthor(){
        System.out.println("Who is the website author?");
        return input.nextLine();
    }
    //Ask if the user wants a folder for JavaScript files
    public boolean askJSFiles(){
        String answer;
        int validator =0;
        do {
            System.out.println("Do you want a folder for JavaScript (y/n)?");
            answer = input.nextLine();
            //validate input
            if(answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("n")){
                validator = 1;
            }else{
                System.out.println("Entry invalid. Please type y or n.");
                validator = -1;
            }
        } while (validator<0);
        if (answer.equalsIgnoreCase("y")){
            return true;
        }
        else{
            return false;
        }
    }
    //Ask if the user wants a folder for CSS files
    public boolean askCSSFiles(){
        String answer;
        int validator =0;
        do {
            System.out.println("Do you want a folder for CSS (y/n)?");
            answer = input.nextLine();
            //validate input
            if(answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("n")){
                validator = 1;
            }else{
                System.out.println("Entry invalid. Please type y or n.");
                validator = -1;
            }
        } while (validator<0);
        if (answer.equalsIgnoreCase("y")){
            return true;
        }
        else{
            return false;
        }
    }
}
