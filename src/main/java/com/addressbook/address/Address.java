package com.addressbook.address;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public interface Address {
    String address();
}
