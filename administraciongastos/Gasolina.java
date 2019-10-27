package com.e.administraciongastos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Gasolina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasolina);
    }

    public void Regresar (View view){

        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }

    public void gasto(View view) {

        Toast.makeText(this, "Gasolina Descontada de tu Salario", Toast.LENGTH_LONG).show();

    }
}
