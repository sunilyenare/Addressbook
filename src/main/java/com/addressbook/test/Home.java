package com.addressbook.test;

public class Home implements Address{
    private String landmark;
    private String city;
    private  String state;
    private  int zip;
    public Home(String landmark, String city, String state, int zip) {
        this.landmark=landmark;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }

    @Override
    public String address() {
        return landmark +city+state+zip;
    }
}
