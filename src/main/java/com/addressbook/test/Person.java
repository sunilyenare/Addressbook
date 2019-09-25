package com.addressbook.test;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Person {
    private String firstName;
    private String lastName;
    private  String mobileNumber;
    private String address;

    public Person(String firstName, String lastName, String mobileNumber, String address){
        this.firstName=firstName;
        this.lastName=lastName;
        this.mobileNumber=mobileNumber;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
                + ", address=" + address + "]";
    }
}
