package com.addressbook.test;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Add extends AddressBook {
    private Person person;
    private List<Person> personCollection = new ArrayList<Person>();
    private File file =new File("AllBook/" + bookName + ".json");
    private ObjectMapper objectMapper= new ObjectMapper();
    public Add(String bookName, Person person) {
        super(bookName);
        this.person = person;
    }

    @Override
    public boolean execute() throws IOException {
        if (new File("AllBook/" + bookName + ".json").canRead()) {
            personCollection.add(person);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, personCollection);
            return true;
        }
        return false;
    }
}
