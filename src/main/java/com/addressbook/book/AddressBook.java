package com.addressbook.book;

import com.addressbook.Person;
import org.codehaus.jackson.annotate.JsonAutoDetect;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public abstract class AddressBook {
    protected String bookName;

    public AddressBook(String bookName) {
        this.bookName = bookName;
    }

    public abstract boolean execute() throws IOException;

    protected File file = new File("AllBook/" + bookName + ".json");
    protected List<Person> people = new ArrayList<Person>();

}
