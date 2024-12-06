package com.example.javafx_retrofit_gson;

public class Record{
    public int id;
    public String name;

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
