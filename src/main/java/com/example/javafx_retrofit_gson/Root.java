package com.example.javafx_retrofit_gson;

import java.util.ArrayList;

public class Root {
    public ArrayList<Record> records;

    @Override
    public String toString() {
        return "Root{" +
                "records=" + records +
                '}';
    }
}
// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
