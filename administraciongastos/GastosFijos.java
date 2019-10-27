package com.e.administraciongastos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GastosFijos extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos_fijos);
    }
    public void Regresar (View view){

        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }
    public void Renta (View view){

        Intent renta = new Intent(this,Renta.class);
        startActivity(renta);
    }
    public void PlanTelefonico (View view){

        Intent plan = new Intent(this,PlanTelefonico.class);
        startActivity(plan);
    }
    public void seguros (View view){

        Intent plan = new Intent(this,Seguros.class);
        startActivity(plan);
    }
}
