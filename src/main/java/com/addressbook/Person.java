package com.addressbook;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Person {
    private String firstName;
    private String lastName;
    private  String mobileNumber;
    private  Address address;

    public Person(String firstName, String lastName, String mobileNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public Person() {
    }
}
