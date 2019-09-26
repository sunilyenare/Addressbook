package com.addressbook;

import org.codehaus.jackson.annotate.JsonAutoDetect;

import java.io.IOException;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Main {
    public static void main(String args[]) throws IOException {
        Address home = new Home("234,HSTR ", "Mysoree", "Karnataka", 560076);
        Person person = new Person("Sunil Yenare", "Yenare", "0987654321", home);
        AddressBook addressBook = new Add("Bangalore", person);
        addressBook.execute();
    }
}
