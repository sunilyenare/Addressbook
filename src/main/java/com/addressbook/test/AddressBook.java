package com.addressbook.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

public class AddressBook {

    private String bookName;
    private List<Person> personCollection=new ArrayList<Person>();
    public AddressBook(String bookName) {
        this.bookName = bookName;
    }

    public boolean create() throws IOException {

        if (!bookName.isEmpty()) {
            new File("AllBook/" + bookName + ".json").createNewFile();
            return true;
        }

        return false;
    }

    public boolean open() {

        if (!bookName.isEmpty()) {
            new File("AllBook/" + bookName + ".json").canRead();
            return true;
        }
        return false;
    }

    public boolean add(Person person) throws IOException {

        if(new File("AllBook/" + bookName + ".json").canRead())
        {
            personCollection.add(person);
            new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(new File("AllBook/" + bookName + ".json"),personCollection);
            return true;
        }
        return false;
    }
}
