package ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class Website {
    private final String siteName;
    private final String siteAuthor;

    public Website(String siteName,String siteAuthor){
        this.siteName = siteName;
        this.siteAuthor = siteAuthor;
    }

    //Generate index.html with
    //name of site in the <title> tag
    //author in the <meta>tag
    public String makeHTML(){

        try(Formatter output = new Formatter("src/main/java/ex43/website/index.html")){
            output.format("<HTML>");
            output.format("<HEAD>");
            output.format("<TITLE>"+siteName+"</TITLE>");
            output.format("<meta name = \"author\" content = \""+siteAuthor+"\">");
            output.format("</HEAD>");
            output.format("<BODY>");
            output.format("</BODY>");
            output.format("</HTML>");

        }catch(SecurityException | FileNotFoundException | FormatterClosedException e){
            e.printStackTrace();
        }
        return "Created .src\\main\\java\\ex43\\website\\index.html";
    }

}
