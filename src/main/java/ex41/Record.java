package ex41;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.io.FileNotFoundException;
import java.util.*;


public class Record {
    private final ArrayList<Person> record = new ArrayList<>();
    private final int recordCount;

    //Convert file data into people record
    public Record(ArrayList<String> fileData){
        for (String fullName : fileData) {
            //Split full name into first and last name
            String[] namePieces = fullName.split(" ");
            String lastName = namePieces[0];
            String firstName = namePieces[1];
            Person addPerson = new Person(lastName, firstName);
            //Add people to the record
            record.add(addPerson);
        }
        recordCount = record.size();
    }

    public ArrayList<Person> getRecord() {
        return record;
    }

    public int getRecordCount() {
        return recordCount;
    }

    //Sort the record alphabetically
    public void sortRecord(){
        record.sort(Comparator.comparing(Person::getFirstName));
        record.sort(Comparator.comparing(Person::getLastName));
   }

   //Print record to file
    public void printRecordToFile(){
        try(Formatter output = new Formatter("src/main/java/ex41/exercise41_output.text")){
        output.format("Total of %d names%n", recordCount);
        output.format("------------------------------%n");
        for (int i=0; i<recordCount; i++){
            Person printPerson = record.get(i);
            output.format("%s %s%n", printPerson.getLastName(), printPerson.getFirstName());
        }}catch(SecurityException | FileNotFoundException | FormatterClosedException e){
            e.printStackTrace();
        }

    }

}
