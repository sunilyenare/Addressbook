package com.addressbook.address;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Address {
    private String landmark;
    private String city;
    private String state;
    private int zip;

    public Address(String landmark, String city, String state, int zip) {
        this.landmark = landmark;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String address() {
        return landmark + city + state + zip;
    }
}
