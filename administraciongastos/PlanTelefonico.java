package com.e.administraciongastos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PlanTelefonico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_telefonico);
    }
    public void Regresar (View view){

        Intent regresar = new Intent(this,GastosFijos.class);
        startActivity(regresar);
    }
    public void gastoenplantelefonico(View view) {

        Toast.makeText(this, "Plan Descontado de tu Salario", Toast.LENGTH_LONG).show();

    }
}
