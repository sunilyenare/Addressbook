package com.addressbook.test;

import java.io.File;
import java.io.IOException;

public class AddressBook {

    private String bookName;

    public AddressBook(String bookName) {
        this.bookName=bookName;
    }


    public boolean create() throws IOException {

        String filePath="AllBook/"+bookName+".json";
        if (!bookName.isEmpty()){
            new File(filePath).createNewFile();
            return true;
        }

        return false;
    }

    public boolean open() {
        String filePath="AllBook/"+bookName+".json";
        if(new File(filePath).canRead())
            return true;
        return false;
    }
}
