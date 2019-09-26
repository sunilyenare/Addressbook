package com.addressbook.test;

import org.codehaus.jackson.annotate.JsonAutoDetect;

import java.io.File;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Open extends AddressBook {
    public Open(String bookName) {
        super(bookName);
    }
    @Override
    public boolean execute() {
        if (!bookName.isEmpty()) {
            new File("AllBook/" + bookName + ".json").canRead();
            return true;
        }
        return false;
    }
}
