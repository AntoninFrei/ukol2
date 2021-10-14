package com.engeto.examples;

import java.time.LocalDate;


/*Evidence hostu*/
public class Guest {
    private String firstName;
    private String surName;
    private LocalDate dateOfBird;

    public Guest(String firstName, String surName, LocalDate dateOfBird) {
        this.firstName = firstName;
        this.surName = surName;
        this.dateOfBird = dateOfBird;

    }

    public void printDescription() {
        System.out.printf("Jméno: \t\t\t\t%s%nPříjmení: \t\t\t%s%nDatum narození: \t%s%n---------%n%n",
    this.firstName,this.surName,this.dateOfBird);

    }

    public String getFullName() {
        return this.firstName + " " + this.surName;
    }

}
