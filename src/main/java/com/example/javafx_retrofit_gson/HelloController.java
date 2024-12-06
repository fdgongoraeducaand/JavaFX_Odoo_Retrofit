package com.example.javafx_retrofit_gson;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;

    public void initialize() {


    }
    @FXML
    protected void onHelloButtonClick() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8069/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService apiService = retrofit.create(APIService.class);
        Call<Root> call = apiService.getBancos("res.bank","fgonaci085@g.educaand.es",
                                                         "usuario",
                                                         "c9d21e22-9ba7-4302-a4aa-8653a42541f7"
                );
//,                @Body String body,"{\"fields\": [\"name\"]}"
        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                ObservableList<Root> observableList = FXCollections.observableArrayList();
                observableList = FXCollections.observableArrayList(response.body());
                System.out.println(observableList);
            }
// 2
            @Override
            public void onFailure(Call<Root> call, Throwable throwable) {
                Platform.runLater(() -> {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setContentText("Erreur de connection!!!");
                    alert.showAndWait();
                });
            }
        });
    }
}