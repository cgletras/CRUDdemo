package com.example.cruddemo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cruddemo.R;
import com.example.cruddemo.dto.DtoUser;
import com.example.cruddemo.services.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastroDeUsuarioActivity extends AppCompatActivity {

  private static final String TAG = "CadastroDeUsuarioActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_de_usuario);
    }

    public void cadastrar(View view) {
        String name = ((EditText)findViewById(R.id.et_cadastro_usuario_name)).getText().toString();
        String phone = ((EditText)findViewById(R.id.et_cadastro_usuario_phone)).getText().toString();
        String email = ((EditText)findViewById(R.id.et_cadastro_usuario_email)).getText().toString();
        String password = ((EditText)findViewById(R.id.et_cadastro_usuario_password)).getText().toString();

        DtoUser dtoUser = new DtoUser(email, name, password, phone);

        RetrofitService.getServico().cadatraUsuario(dtoUser).enqueue(new Callback<DtoUser>() {
            @Override
            public void onResponse(Call<DtoUser> call, Response<DtoUser> response) {
                Toast.makeText(CadastroDeUsuarioActivity.this, "Usuario Cadastrado com id: "+response.body().getId(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<DtoUser> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage());
            }
        });

    }
}
