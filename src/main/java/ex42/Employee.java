package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class Employee {
    private final String firstName;
    private final String lastName;
    private final String salary;


    public Employee(String lastName, String firstName, String salary){
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSalary() {
        return salary;
    }
}