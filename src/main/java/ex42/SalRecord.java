package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.ArrayList;


public class SalRecord {
    private final ArrayList<Employee> record = new ArrayList<>();
    private final int recordCount;

    //Convert file data into employee record
    public SalRecord(ArrayList<String> fileData){
        for (String fullRecord : fileData) {
            //Split full string into first and last name and salary
            String[] recordPieces = fullRecord.split(",");
            String lastName = recordPieces[0];
            String firstName = recordPieces[1];
            String salary = recordPieces[2];
            Employee addPerson = new Employee(lastName,firstName,salary);
            //Add people to the record
            record.add(addPerson);
        }
        recordCount = record.size();
    }

    public ArrayList<Employee> getRecord() {
        return record;
    }


    //Print record in an evenly spaced table
    public void printRecord(){
        String header1 = "Last";
        String header2 = "First";
        String header3 = "Salary";

        System.out.printf("%-15s %-15s %-15s%n",header1,header2,header3);
        System.out.println("-----------------------------------------------");
        for (int i=0; i<recordCount; i++){
            Employee printPerson = record.get(i);
            System.out.printf("%-15s %-15s %-15s%n", printPerson.getLastName(), printPerson.getFirstName(), printPerson.getSalary());
        }

    }

}
