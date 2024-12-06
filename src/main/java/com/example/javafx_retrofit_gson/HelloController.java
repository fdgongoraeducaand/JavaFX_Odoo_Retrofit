package com.example.javafx_retrofit_gson;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

import java.util.List;
import java.util.Map;

public class HelloController {
    @FXML
    private Label welcomeText;

    public void initialize() {


    }
    @FXML
    protected void onHelloButtonClick() {

        // Generamos un objeto campos que contendrá el array que debemos poner en formato JSON en el BODY
        // Este JSON debe tener el formato  '{"fields": ["name"]}'
        // Para generarlo parece que no podemos hacerlo en formato texto y debemos preparar objetos que
        // la librería GSON de Google se encarga de formatear para que se haga bien la solicitud.
        CamposDevueltos campos = new CamposDevueltos();
        campos.addCampo("name");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8069/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService apiService = retrofit.create(APIService.class);
        Call<Root> call = apiService.getBancos("res.bank","fgonaci085@g.educaand.es",
                                                         "usuario",
                                                         "0553f96c-b7a3-4a49-b40e-e9697b937b73",
                                                             campos
                                               );

        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                if (response.isSuccessful()) {
                    ObservableList<Root> observableList = FXCollections.observableArrayList();
                    observableList = FXCollections.observableArrayList(response.body());
                    System.out.println(observableList);
                } else {
                    System.out.println(response.code() + " : " + response.message());
                }
            }

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