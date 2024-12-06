package com.example.javafx_retrofit_gson;

import java.util.ArrayList;

public class CamposDevueltos {
    private ArrayList<String> fields ;
    public CamposDevueltos() {
        fields = new ArrayList<String>();
    }
    public void addCampo (String campo) {
        fields.add(campo);
    }
}
