package ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FolderManager {

    //add folder for website
    public String createWebsiteFolder(){
        String createStatus;
        //code adapted from: https://mkyong.com/java/how-to-create-directory-in-java/
        try {
            Path path = Paths.get("src/main/java/ex43/website");
            //java.nio.file.Files;
            Files.createDirectories(path);
            createStatus = String.format("%s", "Created ." + path);
        } catch (IOException e) {
            createStatus = "Failed to create directory!" + e.getMessage();
        }
        return createStatus;
    }

    //if yes, add folder for JS
    public String createJSFolder(boolean answer){
        String status;
        if (answer){
            try {
                Path path = Paths.get("src/main/java/ex43/website/js/");
                //java.nio.file.Files;
                Files.createDirectories(path);
                status = String.format("%s", "Created ." + path);
            } catch (IOException e) {
                status = "Failed to create directory!" + e.getMessage();
            }
        }else{
            status = "";
        }
        return status;
    }
    //if yes, add folder for CSS
    public String createCSSFolder(boolean answer){
        String status;
        if (answer){
            try {
                Path path = Paths.get("src/main/java/ex43/website/css/");
                //java.nio.file.Files;
                Files.createDirectories(path);
                status = String.format("%s", "Created ." + path);
            } catch (IOException e) {
                status = "Failed to create directory!" + e.getMessage();
            }
        }else{
            status = "";
        }
        return status;
    }
    //Print creation status
    public void printFolderStatus(String status){
        if(!status.equalsIgnoreCase("")){
            System.out.println(status);
        }
    }


}
