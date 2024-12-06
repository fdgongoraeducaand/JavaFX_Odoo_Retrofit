package com.example.javafx_retrofit_gson;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface APIService {

    //@GET("send_request" )
    @Headers("login: fgonaci085@g.educaand.es;password: usuario;api-key: c9d21e22-9ba7-4302-a4aa-8653a42541f7")
    @HTTP(hasBody = true,method = "GET", path = "/send_request")
    Call<Root> getBancos(@Query("model") String send_request,
                         @Header("login") String login,
                         @Header("password") String pass,
                         @Header("api-key") String key
                         );
}
