package ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.ArrayList;


public class WordFinder {
    private static final String searchWord = "utilize";
    private static final String replaceWord = "use";

    //search for "utilize"
    //replace "utilize" with "use"
    public ArrayList<String> searchAndReplace(ArrayList<String> fileData){
        ArrayList<String> modifiedFile = new ArrayList<>();
        for(int i=0; i< fileData.size(); i++){
            String searchString = fileData.get(i);
            String replace = searchString.replaceAll(searchWord,replaceWord);
            modifiedFile.add(replace);
        }
        return modifiedFile;
    }
}
