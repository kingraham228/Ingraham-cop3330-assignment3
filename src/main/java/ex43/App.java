package ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String[] args){

        //Prompt for the name of the site
        UserInput uInput = new UserInput();
        String siteName = uInput.getSiteName();

        //Prompt for the author of the site
        String author = uInput.getAuthor();

        //Ask if the user wants a folder for JavaScript files
        boolean jsFiles = uInput.askJSFiles();

        //Ask if the user wants a folder for CSS files
        boolean cssFiles = uInput.askCSSFiles();

        //Create a folder for the website
        FolderManager websiteFolders = new FolderManager();
        String status = websiteFolders.createWebsiteFolder();

        //Print status
        websiteFolders.printFolderStatus(status);

        //Create JS folder
        status = websiteFolders.createJSFolder(jsFiles);

        //Print Status
        websiteFolders.printFolderStatus(status);

        //Create CSS folder
        status = websiteFolders.createCSSFolder(cssFiles);

        //Print Status
        websiteFolders.printFolderStatus(status);

        //Generate index.html with
        //name of site in the <title> tag
        //author in the <meta>tag
        Website userWebsite = new Website(siteName,author);
        status = userWebsite.makeHTML();
        //Print Status
        websiteFolders.printFolderStatus(status);
        //Files visible in the directory
    }


}
