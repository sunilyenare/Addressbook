package com.addressbook.book;

import java.io.File;
import java.io.IOException;

public class Create extends AddressBook {
    public Create(String bookName) {
        super(bookName);
    }

    @Override
    public boolean execute() throws IOException {
        if (!bookName.isEmpty()) {
            new File("AllBook/" + bookName + ".json").createNewFile();
            return true;
        }

        return false;
    }
}
