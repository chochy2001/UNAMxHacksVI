package com.e.administraciongastos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Entretenimiento extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entretenimiento);



    }

    public void Regresar (View view){

        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }
    public void netflix (View view){

        Toast.makeText(this,"Netflix Descontado de tu salario",Toast.LENGTH_LONG).show();
    }
    public void amazon (View view){

        Toast.makeText(this,"Amazon Prime Video Descontado de tu salario",Toast.LENGTH_LONG).show();
    }

    public void claro (View view){

        Toast.makeText(this,"Claro Video Descontado de tu salario",Toast.LENGTH_LONG).show();
    }

    public void spotify (View view){

        Toast.makeText(this,"Spotify Descontado de tu salario",Toast.LENGTH_LONG).show();
    }



}
