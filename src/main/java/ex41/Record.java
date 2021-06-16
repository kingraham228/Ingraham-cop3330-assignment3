package ex41;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
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

   //Print record
    public void printRecord(){
        System.out.printf("Total of %d names%n", recordCount);
        System.out.println("------------------------------");
        for (int i=0; i<recordCount; i++){
            Person printPerson = record.get(i);
            System.out.printf("%s %s%n", printPerson.getLastName(), printPerson.getFirstName());
        }

    }

}
