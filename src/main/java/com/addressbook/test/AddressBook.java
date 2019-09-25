package com.addressbook.test;

import java.io.File;
import java.io.IOException;

public class AddressBook {

    private String bookName;
    private final String filePath = "AllBook/" + bookName + ".json";

    public AddressBook(String bookName) {
        this.bookName = bookName;
    }

    public boolean create() throws IOException {

        if (!bookName.isEmpty()) {
            new File(filePath).createNewFile();
            return true;
        }

        return false;
    }

    public boolean open() {

        if (!bookName.isEmpty()) {
            new File(filePath).canRead();
            return true;
        }
        return false;
    }
}
