package com.example.javafx_retrofit_gson;

import retrofit2.Call;
import retrofit2.http.*;

public interface APIService {

    //@GET("send_request" )
    @Headers("Content-type: application/json")
    // Al ser una petición GET, se supone que no debe contener BODY. Normalmente el Body es para el alta, edición y borrado
    // Como si se lo ponemos y la definimos con @GET nos dá problemas, hay que utilizar la anotación HTTP con el method
    // 'get' en minúscula, con el valor de hasbody a true. De este modo, tras mucho investigar, funciona :).
    @HTTP(method = "get", path = "/send_request", hasBody = true)
    Call<Root> getBancos(@Query("model") String send_request,
                         @Header("login") String login,
                         @Header("password") String pass,
                         @Header("api-key") String key,
                         @Body CamposDevueltos params
                         );
}
