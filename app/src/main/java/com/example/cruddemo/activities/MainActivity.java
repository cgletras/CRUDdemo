package com.example.cruddemo.activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.cruddemo.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()){
            case R.id.action_alteracao_usuario:
                startActivity(new Intent(this,AlteracaoDeUsuarioActivity.class));
                return true;
            case R.id.action_cadastro_usuario:
                startActivity(new Intent(this,CadastroDeUsuarioActivity.class));
                return true;
            case R.id.action_excluir_usuario:
                startActivity(new Intent(this,ExcluirUsuarioActivity.class));
                return true;
            case R.id.action_listar_usuarios:
                startActivity(new Intent(this,ListaDeUsuariosActivity.class));
                return true;
            case R.id.action_login:
                startActivity(new Intent(this,LoginActivity.class));
                return true;


        }

        return super.onOptionsItemSelected(item);
    }
}
