package com.addressbook;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class Save extends AddressBook {
    public Save(String bookName) {
        super(bookName);
    }

    @Override
    public boolean execute() throws IOException {
        new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(file, people);
        return false;
    }
}
