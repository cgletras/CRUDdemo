package com.example.cruddemo.services;

import com.example.cruddemo.dto.DtoUser;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface ApiEndPoint {

    @POST("/users")
    Call<DtoUser> cadatraUsuario(@Body DtoUser dtoUser);

    @POST("/auth/login")
    Call<DtoLogin> login(@Body DtoLogin dtoLogin);
}
